import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int cnt = 0;
        String ABC = "ABC";
        for (int i = 0; i < n - 2; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            char c = s.charAt(i + 2);
            String tmp = String.valueOf(a) + String.valueOf(b) + String.valueOf(c);
            if (tmp.equals(ABC) ) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
