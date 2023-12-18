import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        String c = scan.next();
        
        Integer ia = 0, ib = 0, ic = 0;

        char d = 'a';
        while(true) {
            if (d == 'a') {
                if (ia >= a.length()) {
                    System.out.println("A");
                    return;
                }
                d = a.charAt(ia++);
            } else if (d == 'b') {
                if (ib >= b.length()) {
                    System.out.println("B");
                    return;
                }
                d = b.charAt(ib++);
            } else {
                if (ic >= c.length()) {
                    System.out.println("C");
                    return;
                }
                d = c.charAt(ic++);
            }
        }
    }
}
