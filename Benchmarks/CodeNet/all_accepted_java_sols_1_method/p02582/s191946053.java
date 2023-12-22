import java.util.*;

public class Main {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        char a = s.charAt(0);
        char b = s.charAt(1);
        char c = s.charAt(2);

        if (a == 'R') {
            if (b== 'R') {

                if (c == 'R') {
                    System.out.println(3);
                } else {
                    System.out.println(2);
                }
            }  else {
                System.out.println(1);
            }
        } else {
            if (b== 'R') {
                if (c== 'R') {
                    System.out.println(2);
                } else {
                    System.out.println(1);
                }
            } else {
                if (c=='R') {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
        }

    }
}