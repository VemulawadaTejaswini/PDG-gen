import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        int a = 0;
        int b = 0;
        int c = 0;

        String[] req;
        for (int i = 0; i < count; i++) {
            sc.hasNext();
            String s = sc.nextLine();
            req = s.split(" ");
            a = Integer.parseInt(req[0]);
            b = Integer.parseInt(req[1]);
            c = Integer.parseInt(req[2]);

            if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}