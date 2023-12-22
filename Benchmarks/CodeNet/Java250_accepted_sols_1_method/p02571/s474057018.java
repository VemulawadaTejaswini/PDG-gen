import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        String[] s = S.split("");
        String[] t = T.split("");
        int ans = t.length;
        for(int i=0; i<=s.length-t.length; i++) {
            int count = t.length;
            for(int j=0; j<t.length; j++) {
                if(s[i+j].equals(t[j])) {
                    count--;
                }
            }
            if(ans > count) ans = count;
        }
        System.out.println(ans);
    }
}
