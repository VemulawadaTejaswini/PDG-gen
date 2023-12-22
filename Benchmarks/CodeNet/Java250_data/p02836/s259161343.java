import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int l = S.length();
        int ans = 0;
        
       if(l%2==0){
           for(int i=0; i<l/2; i++){
               if(S.charAt(i)!=S.charAt(l-1-i)){
                    ans = ans + 1;
               }
           }
       }
       else{
           for(int i=0; i<l/2; i++){
               if(S.charAt(i)!=S.charAt(l-1-i)){
                   ans = ans + 1;
               }
           }
       }
       System.out.println(ans);
    }
}