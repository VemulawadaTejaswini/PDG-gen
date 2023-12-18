import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        int l = S.length();
        char[] T = new char[l];
        String ans = "";
        String A = "A";

        for(int i=0; i<l; i++){
            T[i] = (char)((S.charAt(i) - A.charAt(0) + N) % 26 + A.charAt(0));
            ans = ans + T[i];
        }
        System.out.println(ans);

    }
}