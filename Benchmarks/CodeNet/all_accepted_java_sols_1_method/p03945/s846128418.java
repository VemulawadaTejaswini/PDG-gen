import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        String S = sc.next();
        int l = S.length();
        int ans = 0;

        for(int i=l-2; i>=0; i--){
            if(S.charAt(i)!=S.charAt(i+1)){
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}