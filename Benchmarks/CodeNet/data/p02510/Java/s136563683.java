import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s;
        int m, sum;
        while (true) {
            s = sc.next();
            if (s.equals("-")) break;
            m = sc.nextInt();

            sum = 0;
            for (int i = 0; i < m; i++) {
                sum = (sum + sc.nextInt()) % s.length();
            }
            System.out.println(s.substring(sum) + s.substring(0, sum));
        }
    }
}