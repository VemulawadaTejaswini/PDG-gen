import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] p = new int[N];
        for (int i = 0; i < N; i++) {
            p[i] = sc.nextInt();
        }

        long sum = 0;
        LinkedList<Integer> q = new LinkedList<>();
        for (int i = 0; i < K; i++) {
            sum += p[i];
            q.offer(p[i]);
        }
        //System.out.println(q);
        int maxL = 0;
        int maxR = K-1;
        long max = sum;
        //System.out.println("# "+sum+" "+maxL + " " + maxR);
        for (int i = K; i < N; i++) {
            int l = q.poll();
            sum -= l;
            sum += p[i];
            q.offer(p[i]);
        //System.out.println(q + " " +sum+","+max);
            if (sum > max) {
                max = sum;
                maxL = i-(K-1);
                maxR = i;
            }
        }

        long ans = 0;
        for (int i = maxL; i <= maxR; i++) {
            ans += p[i]+1;
        }
        //System.out.println(maxL + " " + maxR);
        System.out.println((double)ans/2);
    }
}

