import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = sc.nextInt();

        long[] arr = new long[N];

        long[] res = new long[N];


        for(int i = 0; i < N; i++) {
            arr[i] = 2 * sc.nextInt();
        }

        int test = 0;
        long sum = 0;
        for(int j = 0; j < N; j++) {
            if (test == 0) {
                sum = sum + arr[j];
                test = 1;
            }
            else {
                sum = sum - arr[j];
                test = 0;
            }
        }
        long first = sum / 2;


        for(int i = 0; i < N; i++) {
            long temp = first;
            first = arr[i] - first;
            res[i] = temp;

        }

        for(int i = 0; i < N; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
