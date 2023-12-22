import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = Integer.valueOf(s);
        int cnt = 0;
        for (int i = 0 ; i < s.length() ; i++) {
            cnt += Character.getNumericValue(s.charAt(i));
        }
        System.out.println(n % cnt == 0 ? "Yes" : "No");
    }
}