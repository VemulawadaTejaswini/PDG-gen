import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        long K = scan.nextInt();

        int[] arr = new int[N + M];

        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = N; i < N + M; i++) {
            arr[i] = scan.nextInt();
        }
        
        Arrays.sort(arr);

        int count = 0;
        long sum = 0;

        for (int i = 0; i < N + M; i++) {
            sum += arr[i];
            if (sum <= K) count++;
            else break;
        }

        System.out.println(count);


    }
}
