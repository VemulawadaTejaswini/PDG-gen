import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long res = a[n-1];

        PriorityQueue<Interval> q = new PriorityQueue<>();
        q.offer(new Interval(a[n-2], a[n-1]));
        q.offer(new Interval(a[n-2], a[n-1]));
        for(int i = n-3; i>=0; i--) {
            Interval v = q.poll();
            res += v.min();
            q.offer(new Interval(v.a, a[i]));
            q.offer(new Interval(v.b, a[i]));
        }
        System.out.println(res);

    }

    static class Interval implements Comparable<Interval> {
        int a;
        int b;
        Interval(int a, int b) {
            this.a = a;
            this.b = b;
        }
        int min() {
            return Math.min(a, b);
        }
        @Override public int compareTo(Interval o) {
            return o.min() - min();
        }
    }




}