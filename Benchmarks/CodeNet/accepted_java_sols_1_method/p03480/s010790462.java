import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int ans = s.length;
        for (int i = 0; i < s.length - 1; i++) {
            if(s[i] != s[i+1]){
                ans = Math.min(ans, Math.max(i+1, s.length - (i+1)));
            }
        }
        System.out.println(ans);
        sc.close();
    }

}
