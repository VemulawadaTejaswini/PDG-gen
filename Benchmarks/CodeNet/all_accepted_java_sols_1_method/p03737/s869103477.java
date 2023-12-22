import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a, b, c, d, e, f;
        a = s.next();
        b = s.next();
        c = s.next();
        d = a.toUpperCase();
        e = b.toUpperCase();
        f = c.toUpperCase();

        System.out.print(d.charAt(0));
        System.out.print(e.charAt(0));
        System.out.print(f.charAt(0));
    }
}
