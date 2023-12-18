import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        
        int ans = 0;
        int len = 0;
        for(int i = 0; i  < S.length(); i++){
            char x = S.charAt(i);
            
            switch(x){
                case 'A' :
                case 'C' :
                case 'G' :
                case 'T' :
                    len++;
                    break;                    
                default :
                    len = 0;
                    break;
            }
            
            ans = Math.max(ans, len);
        }
        
        System.out.println(ans);
    }
}
