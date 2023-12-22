
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int min = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            String tmp = s.substring(i, i + 3);
            int kk = Integer.parseInt(tmp);
            int ck = Math.abs(kk - 753);
            if (i == 0) {
                min = ck;
            } else {
                min = Math.min(min, ck);
            }
        }
        System.out.println(min);

    }

}
