import java.util.*;
import java.lang.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] weight = new int[N];
        int sum =0;
        int sum2 = 0;
        int[] g = new int[N];
        for(int j =0; j < N ; j++){
            weight[j] = sc.nextInt();

        }
        for(int t =1; t <= N; t ++) {
            for (int i = 1; i <= N; i++) {
                if (i <= t) {
                    sum += weight[i-1];
                } else if(i > t){
                    sum2 += weight[i-1];
                }
            }
            g[t-1] = Math.abs(sum - sum2);
            sum =0;
            sum2 =0;
        }
        Arrays.sort(g);
        System.out.println(g[0]);
    }
}
