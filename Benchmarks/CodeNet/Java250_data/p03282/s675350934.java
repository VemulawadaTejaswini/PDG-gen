import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long K = sc.nextLong();
        
        int ans = 1;
        for(int i = 0; i < S.length(); i++){
            if( S.charAt(i) !=  '1' ){
                ans = S.charAt(i) - '0';
                break;
            }
            
            if( (i+1) == K ) break;
        }
        
        System.out.println(ans);
    }
}
