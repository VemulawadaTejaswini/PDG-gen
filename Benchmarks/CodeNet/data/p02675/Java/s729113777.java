import java.util.*;

public class Main {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);

        int k = scan.nextInt();
        String s = scan.next();

        if (s.length() <= k) {
            System.out.println(s);
        } else {
            String n = s.substring(0, k).concat("...");
            System.out.println(n);
        }

    }


}