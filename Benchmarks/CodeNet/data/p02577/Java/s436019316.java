import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] s = S.split("");
        long ans = 0;
        for(int i=0; i<s.length; i++) {
            ans += Integer.parseInt(s[i]);
        }
        S = String.valueOf(ans);
        s = S.split("");
        long count = 0;
        for(int i=0; i<s.length; i++) {
            count += Integer.parseInt(s[i]);
        }
        if(count % 9 == 0) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
