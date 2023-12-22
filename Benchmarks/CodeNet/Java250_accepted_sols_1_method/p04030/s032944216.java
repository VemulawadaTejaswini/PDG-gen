
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] s = scan.next().split("");
        scan.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("0")) {
                sb.append("0");
            } else if (s[i].equals("1")) {
                sb.append("1");
            } else {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }

        System.out.println(sb.toString());
    }
}
