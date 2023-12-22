import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        String t = sc.next();
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        String u = sc.next();
        if(u.equals(s)) {
            --a;
        } else {
            --b;
        }
        System.out.printf("%d %d", a, b);
    }
}