import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        char[] S = new char[n];
        char[] T = new char[n];
        String ans = "" + s.charAt(0) + t.charAt(0);

        for(int i=1; i<=n-1; i++){
            S[i] = s.charAt(i);
            T[i] = t.charAt(i);
            ans = ans + S[i] + T[i];
        }
        System.out.println(ans);
    }
}