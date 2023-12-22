import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            if (a + i <= b - k) {
                System.out.println(a + i);
            }
        }
        for (int i = k - 1; i >= 0; i--) {
            if (b - i >= a) {
                System.out.println(b - i);
            }
        }
    }
}
