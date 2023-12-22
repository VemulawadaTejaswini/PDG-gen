import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        sc.close();

        int count = 0;
        int idx = 0;
        for (char string : S.toCharArray()) {
            char x = T.charAt(idx);
            if (x != string) {
                count++;
            }
            idx++;
        }

        System.out.println(count);
    }
}
