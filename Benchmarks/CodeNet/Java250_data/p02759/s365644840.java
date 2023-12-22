
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = n /2 + (n % 2 == 0 ? 0 : 1);
        System.out.println(ans);
    }
}
