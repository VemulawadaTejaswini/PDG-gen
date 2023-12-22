import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int ans = N % 1000;
        if (ans != 0) {
            ans = 1000 - ans;
        }
        System.out.println(ans);
    }
}
