import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int ls = S.length();
        int lt = T.length();
        for(int i = ls-lt;i >= 0;i--){
            for(int j = 0;j < lt;j++){
                char s = S.charAt(i+j);
                char t = T.charAt(j);
                if(s != '?' && s != t)  break;
                if(j == lt-1){
                    S = S.replace('?', 'a');
                    System.out.println(S.substring(0, i)+T+S.substring(i+lt, S.length()));
                    return;
                }
            }
        }
        System.out.println("UNRESTORABLE");
    }
}