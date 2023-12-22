import java.util.*;

public class Main {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            String a = sc.next();
            String b = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            String o = sc.next();

            if (o.equals(a)) {
                x--;
                System.out.println(x + " " + y);
            }
            else if (o.equals(b)) {
                y--;
                System.out.println(x + " " + y);
            }
        }
}
