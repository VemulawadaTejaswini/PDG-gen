import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] min = new int[n];
        min[0] = 0;


        for(int i = 1; i < n; i++) {
            int minimum = Integer.MAX_VALUE;
            for(int j = 1; j <= k; j++ ) {
                if(i - j >=0) {
                    minimum = Math.min(minimum, Math.abs(arr[i-j] - arr[i]) + min[i-j]);
                }
            }
            min[i] = minimum;
        }

        System.out.println(min[n-1]);
    }
}
