import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        if(S.length() + 1 != T.length()) {
            System.out.println("No");
            return;
        }
        for(int i=0; i<S.length(); i++) {
            if(S.charAt(i) != T.charAt(i)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
