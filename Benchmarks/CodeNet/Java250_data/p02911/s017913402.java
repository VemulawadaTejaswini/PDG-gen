import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int Q = sc.nextInt();
        int[] arr = new int[N];
        Arrays.fill(arr, K);
        for(int i = 0; i < Q; i++) {
            int v = sc.nextInt();
            arr[v-1]++;
        }
        for(int i = 0; i < N; i++) {
            arr[i] -= Q;
        }
        for(int i = 0; i < N; i++) {
            if(arr[i] > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
