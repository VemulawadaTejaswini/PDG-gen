import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] c = { "black", "blue", "lime", "aqua", "red", "fuchsia", "yellow", "white" };
        for (;;) {
            char[] n = sc.next().toCharArray();
            if (n[0] == '0') {
                break;
            }
            System.out.println(c[parseInt("" + n[1] + n[2], 16) / 128 * 4 + parseInt("" + n[3] + n[4], 16) / 128 * 2 + parseInt("" + n[5] + n[6], 16) / 128]);
        }
    }
}
