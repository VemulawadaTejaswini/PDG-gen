import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];

//        for (int i=0; i<n; i++) a[i] = sc.nextInt();

        PriorityQueue<Double> pq = new PriorityQueue<>();

        for (int i=0; i<n; i++){
            pq.add(sc.nextDouble()*(-1));
        }

        for (int i=0; i<m; i++){
            double p = pq.poll()/2;
            pq.add(p);
        }

        long ans =0;
        while (!pq.isEmpty()){
            ans += pq.poll()*(-1);
        }

        System.out.println(ans);

    }
}