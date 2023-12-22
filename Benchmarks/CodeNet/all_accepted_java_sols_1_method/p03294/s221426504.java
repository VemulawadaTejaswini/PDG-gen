import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        long result = 0L;
        for (int i = 0; i <N; i++) {
            result = result + (a[i] - 1);
        }
        System.out.println(result);

    }
}
