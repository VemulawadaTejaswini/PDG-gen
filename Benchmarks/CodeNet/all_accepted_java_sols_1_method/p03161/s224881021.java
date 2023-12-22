import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        int[] minA = new int[n];
        minA[0] = 0;
        for(int i = 1; i < n; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 1; j <= k; j++){
                if(i - j >= 0){
                    min = Math.min(min, Math.abs(arr[i] - arr[i - j]) + minA[i - j]);
                }
            }
            minA[i] = min;
        }

        System.out.println(minA[n - 1]);

    }
}

