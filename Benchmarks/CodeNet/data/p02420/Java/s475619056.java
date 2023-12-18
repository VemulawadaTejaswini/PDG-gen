import java.util.*;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int m, n;
            String give = sc.next();
            if (give.equals("-")) break;

            m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                n = sc.nextInt();
                String b = give.substring(n, give.length());
                String c = give.substring(0, n);
                give = b + c;
            }
            System.out.println(give);
        }

    }
}
