import java.util.*;
import java.text.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int MOD = (int)998244353;

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        String s = sc.next();

        char c = s.charAt(s.length()-1);

        if (c == '3') {
            System.out.println("bon");
        } else if (c == '0' || c == '1' || c == '6' || c == '8') {
            System.out.println("pon");
        } else {
            System.out.println("hon");
        }



    }
}

