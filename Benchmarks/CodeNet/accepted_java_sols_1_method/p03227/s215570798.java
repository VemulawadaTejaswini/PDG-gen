import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.length() == 2) {
            System.out.println(s);
        } else {
            StringBuffer sb = new StringBuffer(s);
            System.out.println(sb.reverse());
        }
    }
}
