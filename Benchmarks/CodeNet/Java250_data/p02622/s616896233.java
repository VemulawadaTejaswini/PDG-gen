import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String t = input.next();
        int ans = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != t.charAt(i)){
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}