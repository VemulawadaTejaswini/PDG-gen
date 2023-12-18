import java.util.*;
import java.text.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int MOD = (int)998244353;

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int k = sc.nextInt();
        String s = sc.next();

        if (s.length() <= k) {
            System.out.println(s);
        } else {
            s = s.substring(0, k);
            System.out.println(s + "...");
        }


    }
}

