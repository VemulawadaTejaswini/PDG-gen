import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int A = sc.nextInt();
        final int B = sc.nextInt();
        final int C = sc.nextInt();
        final int X = sc.nextInt();

        int ans = 0;
        for (int i = 0; i <= A; i++) {
            for (int j = 0; j <= B; j++) {
                for (int k = 0; k <= C; k++) {
                    if (X == (i * 500 + j * 100 + k * 50)) ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
