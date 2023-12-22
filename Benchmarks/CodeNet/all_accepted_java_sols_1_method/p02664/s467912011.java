
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  str = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '?') {
                sb.append('D');
            } else {
                sb.append(ch);
            }
        }

        String ans = sb.toString();

        System.out.println(ans);
    }
}
