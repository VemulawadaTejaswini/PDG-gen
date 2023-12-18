import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String s = scan.next();

            if (s.equals("-")) {
                break;
            }

            int m = scan.nextInt();

            for (int i = 0; i < m; i++) {
                int h = scan.nextInt();
                String result_a = s.substring(0,h);
                String result_b = s.substring(h);

                System.out.println(result_b + result_a);
            }
        }

    }
}

