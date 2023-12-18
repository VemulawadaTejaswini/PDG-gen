import java.util.Scanner;

public class Main {

    static int[] X = { -1, 0, 1 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        long fullPattern = 1;
        long nonMatch = 1;
        for (int i = 0; i < N; i++) {
            fullPattern *= 3;

            if (a[i] % 2 == 0) {
                nonMatch *= 2;
            }
        }
        System.out.println(fullPattern - nonMatch);
    }
}
