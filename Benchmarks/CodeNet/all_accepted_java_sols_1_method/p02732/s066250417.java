import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] count = new int[N + 1];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            count[A[i]]++;
        }
        long sum = 0;
        for (int i = 0; i <= N; i++)
            sum += (long)count[i] * (count[i]-1) / 2;
        for (int i = 0; i < N; i++)
            System.out.println(sum - count[A[i]] + 1);
    }
}
