import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int n = Integer.parseInt(String.valueOf(a)+String.valueOf(b));

        for (int i = 1; i < 330; i++) {
            if (i * i == n) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");

    }
}
