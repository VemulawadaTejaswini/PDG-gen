import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        char[] s = sc.nextLine().toCharArray();
        char[] t = sc.nextLine().toCharArray();
        for(int i = 0; i < s.length; i++) {
            if(s[i]==t[i]) {
                ++ans;
            }
        }
        System.out.println(ans);

    }
}