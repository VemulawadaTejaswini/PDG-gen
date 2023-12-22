
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt(), K = sc.nextInt();   //N_max = 100000, K_max = 100, h_max = 10000
        int[] h = new int[N];
        for(int i=0;i<N;i++){
            h[i] = sc.nextInt();
        }
        int[] minCost = new int[N];
        minCost[0] = 0;
        for(int i=1;i<N;i++){
            int costK = 999999999;
            for(int k=1;k<=K;k++) {
                if(k > i){
                    break;
                }else {
                    costK = Math.min(costK, minCost[i - k] + Math.max(h[i] - h[i - k], h[i - k] - h[i]));
                }
            }
            minCost[i] = costK;
        }
        System.out.println(minCost[N-1]);
    }
}
