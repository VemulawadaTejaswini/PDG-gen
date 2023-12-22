import java.util.Scanner;

public class Main {
    static int A;
    static int B;

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        B = scanner.nextInt();
        scanner.close();

        long ans = (A + B) / 2;
        if((A + B) % 2 == 0) {
            System.out.println(ans);
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}