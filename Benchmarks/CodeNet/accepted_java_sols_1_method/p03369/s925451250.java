import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int num = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'o') {
                num++;
            }
        }
        int ans = 700 + 100 * num;
        System.out.println(ans);
    }
}