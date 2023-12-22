import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String str;

        for(;;) {
            str = num.next();
            if (str.equals("-")) break;

            int m = num.nextInt();

            for(int i = 0; i < m; i++) {
                int n = num.nextInt();
                String nextStr = str.substring(n) + str.substring(0, n);
                str = nextStr;
            }
            System.out.println(str);
        }
    }
}
