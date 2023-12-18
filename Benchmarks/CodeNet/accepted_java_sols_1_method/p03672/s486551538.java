import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        
        for (int i = 1; i < s.length() / 2 + 1; i++) {
            String s1 = s.substring(0, i);
            String s2 = s.substring(i, i + i);
            if(s1.equals(s2)){
                if(!s.equals(s1 + s2)) {
                    ans = i * 2;
                }
            }
        }
        
        System.out.println(ans);
        
    }
}
