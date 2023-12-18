
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        for (int i = 0 ; i < s.length() ; i++) {
            String a = s.substring(0, 1);
            String b = s.substring(1, s.length());
            s = b + a;
            if (s.equals(t)) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

}