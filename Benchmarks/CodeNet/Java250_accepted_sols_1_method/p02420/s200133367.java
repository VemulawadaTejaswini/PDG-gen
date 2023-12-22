import java.util.Scanner;

/**
 * Shuffle
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str;
        int m,n = 0;
        while (scan.hasNext()) {
            str = scan.next();
            if (str.equals("-")) {
                return;
            }
            m = scan.nextInt();
            for (int i = 0; i < m; i++) {
                n = scan.nextInt();
                str = str.substring(n, str.length())
                        + str.substring(0, n);
            }
            System.out.println(str);
        }
    }
}