import java.util.*;

public class Main {
    public static void main(String[] args) {
        call(new Scanner(System.in).nextInt());
    }
    private static void call(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0)
                sb.append(' ').append(i);
            else {
                int x = i;
                do {
                    if ( x % 10 == 3) {
                        sb.append(' ').append(i);
                        break;
                    }
                    x /= 10;
                } while (x != 0);
            }
        }
        System.out.println(sb);
    }
}
