import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        boolean isShiritoriA = false;
        boolean isShiritoriB = false;
        isShiritoriA = a.substring(a.length() - 1).equals( b.substring(0, 1) ) ? true : false;
        isShiritoriB = b.substring(b.length() - 1).equals( c.substring(0, 1) ) ? true : false;
        if (isShiritoriA && isShiritoriB) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}