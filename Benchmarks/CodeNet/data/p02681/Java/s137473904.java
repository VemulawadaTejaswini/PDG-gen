import java.util.*;

public class Main {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        String t = scan.next();

        String u = t.substring(0, t.length()-1);

        if (s.equals(u)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}