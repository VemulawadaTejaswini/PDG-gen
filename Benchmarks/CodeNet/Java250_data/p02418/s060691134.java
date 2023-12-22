import java.sql.SQLOutput;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean judge = false;
        String s = scan.nextLine();
        int len = s.length();
        s += s;
        String p = scan.nextLine();
        for (int i = 0; i < len; i++) {
            if (s.substring(i, i + p.length()).equals(p)) judge = true;
        }
        if (judge) System.out.println("Yes");
        else System.out.println("No");
    }
}

