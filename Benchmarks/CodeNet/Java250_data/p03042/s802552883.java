import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int AA = Integer.parseInt(S.substring(0, 2));
        int BB = Integer.parseInt(S.substring(2, 4));
        
        if ( (0 < AA && AA <= 12) ){
            
            if( (0 < BB && BB <= 12) ){
                System.out.println("AMBIGUOUS");
            } else {
                System.out.println("MMYY");
            }
            
        } else {
            
            if( (0 < BB && BB <= 12) ){
                System.out.println("YYMM");
            } else {
                System.out.println("NA");
            }            
            
        }
    }
}
