import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] req = sc.nextLine().split(" ");

        int a = 0;
        int b = 0;
        int c = 0;
        a *= Integer.parseInt(req[0]);
        b *= Integer.parseInt(req[1]);
        c *= Integer.parseInt(req[2]);

        if (a + b == c || b + c == a || c + a == b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}