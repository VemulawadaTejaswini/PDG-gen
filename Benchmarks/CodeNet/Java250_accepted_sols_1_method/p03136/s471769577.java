import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        int[] Ls = new int[N];
        for(int i = 0; i < N; i++) {
            Ls[i] = sc.nextInt();
        }

        Arrays.sort(Ls);

        int sum = 0;
        for(int i = 0;i < N - 1; i++) {
            sum += Ls[i];
        }

        System.out.println(Ls[N-1] < sum ? "Yes" : "No");
    }
}
