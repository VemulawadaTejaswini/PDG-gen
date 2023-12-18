import java.util.Scanner;

/**
 *
 * @author joeco
 */
public class virPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int d =  in.nextInt();
        int t =  in.nextInt();
        int s =  in.nextInt();
        System.out.println((d/(double)s<=t) ? "Yes" : "No" );
        
    }
    
    
    
}