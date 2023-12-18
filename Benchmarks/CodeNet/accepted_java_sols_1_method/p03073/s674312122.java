import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int l = S.length();
        char[] s = new char[l];
        String a = "01";
        int ans = 0;

        for(int i=0; i<l; i++){
            s[i] = S.charAt(i);
        }

        for(int i=1; i<l; i++){
            if(s[i]==s[i-1]){
                if(s[i-1]==a.charAt(0)){
                    s[i] = a.charAt(1);
                }
                else if(s[i-1]==a.charAt(1)){
                    s[i] = a.charAt(0);
                }
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}