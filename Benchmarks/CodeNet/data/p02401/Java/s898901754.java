
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int ans = 0;
        String op = in.next();
        if (op.equals("+")) {
            ans = x + y;
        } else if (op.equals("-")) {
            ans = x - y;
        } else if (op.equals("*")) {
            ans = x * y;
        } else if (op.equals("/")) {
            ans = x / y;
        }
        System.out.println(ans);
    }
}