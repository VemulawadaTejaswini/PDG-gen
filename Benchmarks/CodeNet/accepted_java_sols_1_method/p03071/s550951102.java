import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = Math.max(a, b);
        int ans = c + c;
        if (a != b) {
            ans--;
        }
        System.out.println(ans);
    }
}
