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
            String s = sc.next();
            if (s.equals("0")) {
                break;
            }
            int ret = 0;
            for (int i = 0; i < s.length(); i++) {
                ret += s.charAt(i) - 48;
            }
            System.out.println(ret);
        }
    }
}
