import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        String[] s = S.split("");
        String T = sc.next();
        String[] t = T.split("");
        String ans = "";
        for(int i = 0; i < N; i++) {
            ans = ans + s[i] + t[i];
        }
        System.out.println(ans);
    }
}