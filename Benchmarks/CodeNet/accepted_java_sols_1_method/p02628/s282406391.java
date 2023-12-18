import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] ps = new int[N];
        for (int i = 0; i < N; i++) {
            ps[i] = sc.nextInt();
        }
        Arrays.sort(ps);
        int total = 0;
        for (int i = 0; i < K; i++) {
            total += ps[i];
        }
        System.out.println(total);
    }
}