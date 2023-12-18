import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int ans = 0;
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            String s = S.charAt(i) + "";
            if (s.equals("A")
                || s.equals("C") 
                || s.equals("G") 
                || s.equals("T") ) {
                    count++;
                    if (ans < count) {
                        ans = count;
                    }
                } else {
                if (ans < count) {
                    ans = count;
                }
                count = 0;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
