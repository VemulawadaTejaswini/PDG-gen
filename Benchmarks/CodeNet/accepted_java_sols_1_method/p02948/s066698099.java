import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        Arrays.sort(a, (x, y) -> x[0] - y[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int idx = 0;
        long ans = 0L;
        for(int i = 1; i <= m; i++){
            while(idx < n && a[idx][0] <= i){
                pq.add(a[idx][1]);
                idx++;
            }
            if(!pq.isEmpty()){
                ans += pq.poll();
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
