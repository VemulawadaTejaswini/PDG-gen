import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
    
        char[] s = new char[S.length()];
        char[] t = new char[T.length()];
        int[] ans = new int[S.length() - T.length() + 1];
        int num = 0;
    
        for(int i = 0;i < S.length(); i++){        
           s[i] = S.charAt(i);
        }
        
        for(int i = 0;i < T.length(); i++){        
           t[i] = T.charAt(i);
        }
        
        int h;
        
        for(int i = 0; i < S.length() - T.length() + 1; i++){
            h = i;
            num = 0;
            for(int n = 0 ; n < T.length(); n++){        
                if(s[h]==t[n]){
                }else{
                num++;
                }
                h++;
            }
            ans[i] = num;
        }
        
        int min      = ans[0];
        for (int index = 1; index < ans.length; index ++) {
            min = Math.min(min, ans[index]);
        }
        
        System.out.println(min);
    }
}