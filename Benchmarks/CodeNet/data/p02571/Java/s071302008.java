import java.util.*;

public class Main {


    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        String t = scan.next();
        int check1 = t.length();

        int check2 = t.length();

        for (int i= 0; i<t.length(); i++) {

            String check = t.substring(i);

            if (s.contains(check)) {
                check1 = i;
                break;
            }
        }

        for (int i= 0; i<t.length(); i++) {

            String check = t.substring(0, t.length() - i);

            if (s.contains(check)) {
                check2 = i;
                break;
            }
        }

        System.out.println(Math.min(check1, check2));
    }
}