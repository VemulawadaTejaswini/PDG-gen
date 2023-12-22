import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int cnt0 = 0;
        int cnt1 = 0;
        for(int i = 0; i < S.length(); i++){
            if( S.charAt(i) == '0' ){
                cnt0++;
            } else {
                cnt1++;
            }
        }
        
        System.out.println( Math.min(cnt0, cnt1) * 2 );
        
    }
}
