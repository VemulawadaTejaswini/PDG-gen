
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String result_a = null;
        String result_b = null;

        while (true) {
            String s = scan.next();

            if (s.equals("-")) {
                break;
            }

            int m = scan.nextInt();

            for (int i = 0; i < m; i++) {
                int h = scan.nextInt();
                result_a = s.substring(0,h);
                result_b = s.substring(h);
                
                s = result_b + result_a;


            }

            System.out.println(s);
        }

    }
}
