import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        
        for (int i = 0; i < S.length(); ++i){
            if (S.equals(T)){ 
                System.out.println("Yes");
                return;
            }
            S = S.substring(S.length()-1, S.length()) + S.substring(0, S.length()-1);
        }
 
        System.out.println("No");
 
    }
}