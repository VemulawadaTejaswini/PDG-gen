import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long k = in.nextLong();
        int i = 0;
        while (s.charAt(i) == '1') {
            k--;
            if (k == 0) {
                System.out.println('1');
                return;
            }
            i++;
        }

        System.out.println(s.charAt(i));
    }
}
