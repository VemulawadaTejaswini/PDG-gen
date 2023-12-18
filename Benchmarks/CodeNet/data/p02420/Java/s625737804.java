import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.next();
            if (str.equals("-")) {
                break;
            }
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                int x = sc.nextInt();
                str = str.substring(x) + str.substring(0, x);
            }
            System.out.printf("%s\n", str);
        }
    }
}
