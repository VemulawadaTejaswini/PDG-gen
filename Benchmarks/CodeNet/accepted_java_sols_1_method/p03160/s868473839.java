
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[] h = new int[N];
        for(int i=0;i<N;i++){
            h[i] = sc.nextInt();
        }
        int[] minCost = new int[N];
        minCost[0] = 0;
        minCost[1] = h[1] - h[0];
        minCost[1] *= minCost[1] > 0 ? 1 : -1;
        for(int i=2;i<N;i++){
            int cost2 = minCost[i-2] + ((h[i] > h[i-2]) ? (h[i] - h[i-2]) : (h[i-2] - h[i]));
            int cost1 = minCost[i-1] + ((h[i] > h[i-1]) ? (h[i] - h[i-1]) : (h[i-1] - h[i]));
            minCost[i] = Math.min(cost1, cost2);
        }
        System.out.println(minCost[N-1]);
    }
}
