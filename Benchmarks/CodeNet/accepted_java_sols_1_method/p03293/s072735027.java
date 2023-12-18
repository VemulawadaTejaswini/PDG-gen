import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        String T = sc.next();
        boolean isOK = false;
        
        for(int i = S.length(); i >= 0; i--){
            
            String left = S.substring(0, i);
            String right =S.substring(i, S.length());
            if( T.equals(right + left) ){
                isOK = true;
                break;
            }
        }
        
        System.out.println( isOK ? "Yes" : "No");
        
        
        
    }
}
