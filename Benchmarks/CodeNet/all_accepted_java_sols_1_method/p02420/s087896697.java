import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String a = sc.next();
            if (a.equals("-")) {
                break;
            }
            int b = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < b; i++) {
                sum += sc.nextInt();
            }
            String c = a + a;
            System.out.println(c.substring(sum % a.length(), sum
                    % a.length() + a.length()));
        }
    }
}



