import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();

        int min = 1005;
        for (int i = 0; i <= S.length() - T.length(); i++) {
            int tmp = 0;
            for (int j = 0; j < T.length(); j++) {
                if (S.charAt(i+j) != T.charAt(j)) tmp++;
            }
            min = Math.min(min,tmp);
        }

        System.out.println(min);
    }
}
