import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());
        long d = Long.parseLong(sc.next());
        if(Math.max(a*c,Math.max(a*d,Math.max(b*c,b*d))) < 0) {
            if(a <= 0 && b >= 0 || c <= 0 && d >= 0) {
                System.out.println(0);
            }else {
                System.out.println(Math.max(a*c,Math.max(a*d,Math.max(b*c,b*d))));
            }
        }else {
            System.out.println(Math.max(a*c,Math.max(a*d,Math.max(b*c,b*d))));
        }
    }
}

