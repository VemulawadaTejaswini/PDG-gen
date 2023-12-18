import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] s = S.split(""); 
        int N = s.length;
        
        boolean isnine = true;
        for(int i = 1; i < N; i++) {
            if(s[i].equals("9")) {
                continue;
            }else {
                isnine = false;
                break;
            }
        }
        
        int ans = 0;
        
        if(isnine) {
            for(int i = 0; i < N; i++) {
                ans += Integer.parseInt(s[i]);
            }
        }else {
            ans = Integer.parseInt(s[0]) + 8 + 9*(N-2);
        }
    
        System.out.println(ans);
    }
}