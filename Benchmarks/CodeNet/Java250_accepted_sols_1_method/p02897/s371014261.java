import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        double ans = 1.000 / 2.000;
        if(N % 2 == 0) {
            System.out.println(ans);
        } else {
            ans += 1.000 / (N * 2);
            System.out.println(ans);
        }
    }
}