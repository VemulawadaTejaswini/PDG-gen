import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
    
        int ANS = 0;
        char[] s = new char[S.length() - T.length()];
        char[] t = new char[T.length()];
        int[] ans = new int[S.length() - T.length()];
        int num = 0;
    
        for(int i = 0;i < S.length() - T.length(); i++){        
           s[i] = S.charAt(i);
        }
        
        for(int i = 0;i < T.length(); i++){        
           t[i] = T.charAt(i);
        }
        
        int h;
        
        for(int i = 0;i < S.length() - T.length(); i++){
            h = i;
            for(int n = 0 ; n < T.length(); n++){        
                if(S.charAt(h)==T.charAt(n)){
                }else{
                num++;
                }
                h++;
            }
            ans[i] = num;
            num = 0;
        }
        
        int min      = ans[0];
 
        for (int index = 1; index < ans.length; index ++) {
            min = Math.min(min, ans[index]);
        }
        
        System.out.println(min);
    }
}
