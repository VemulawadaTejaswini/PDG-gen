import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        char[] cs = s.toCharArray();
        Arrays.sort(cs);
        if (cs[0] == cs[1] && cs[2] == cs[3] && cs[0] != cs[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}