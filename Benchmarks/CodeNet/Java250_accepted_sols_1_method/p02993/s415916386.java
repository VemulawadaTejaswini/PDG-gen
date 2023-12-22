import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String scnum = sc.next();
        
        boolean badFlag = true;
        for(int i = 0; i < 3; i++){
            if ( scnum.charAt(i) == scnum.charAt(i+1) ) {
                badFlag = false;
                break;
            }
        }
        
        System.out.println( badFlag ? "Good" : "Bad" );
        
    }
}
