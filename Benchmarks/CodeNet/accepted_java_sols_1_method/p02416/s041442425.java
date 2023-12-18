import java.util.Scanner;

/**
 * Sum of Numbers
 */
public class Main {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        String r;
        int sum = 0;
        while (scan.hasNext()) {
            r = scan.next();
            if (r.equals("0")) {
                break;
            }
            for (int i = 0; i < r.toString().length(); i++) {
                sum += Integer.parseInt(r.toString().substring(i, i + 1));
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}