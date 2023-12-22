import java.io.*;
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = scan.nextInt();
        }
        int solve = dp(n, h, k);
        System.out.println(solve);
    }

    public static int dp(int n, int[] h, int K) {
        int[] arr = new int[n];
        arr[1] = Math.abs(h[0] - h[1]);
        for (int i = 2; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int k = 1; k <= K; k++) {
                if(i-k>=0){
                min  = Math.min(min, Math.abs(h[i-k]-h[i])+arr[i-k]);
            }
                arr[i] = min;
            }
        }
        return arr[n - 1];
    }

}