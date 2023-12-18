
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s  = sc.next();

        int ans1 = 0;
        int ans2 = 0;
        for(int i = 0;i < s.length();i++){
            char c = i % 2 == 0 ? '1' : '0';
            if(s.charAt(i) == c){
                ans1++;
            } else {
                ans2++;
            }
        }
        System.out.println(Math.min(ans1,ans2));
    }
}
