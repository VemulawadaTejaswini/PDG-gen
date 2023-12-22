import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
        	count += S.charAt(i) == T.charAt(i) ? 1 : 0;
        }
        System.out.println(count);
    }
}