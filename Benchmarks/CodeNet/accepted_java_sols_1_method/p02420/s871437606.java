import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
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
