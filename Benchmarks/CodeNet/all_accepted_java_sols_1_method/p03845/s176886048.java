import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] T = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            T[i] = scan.nextInt();
            sum += T[i];
        }
        int M = scan.nextInt();
        for (int i = 0; i < M; i++) {
            int p = scan.nextInt();
            int x = scan.nextInt();
            System.out.println(sum - (T[p-1] - x));
        }
    }
}
