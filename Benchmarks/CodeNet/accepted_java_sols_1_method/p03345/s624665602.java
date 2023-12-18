import java.util.Scanner;

/**
 *
 * @author Suraj
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in =  new Scanner(System.in);
        long A=in.nextLong();
        long B=in.nextLong();
        long C=in.nextLong();
        long K=in.nextLong();
        double x = Math.pow(10,18);
        
        if(K%2==0){
            if(Math.abs(A-B)>=x){
                System.out.println("Unfair");
            }
            else{
                System.out.println(A-B);
            }
        }
        else{
            if(Math.abs(B-A)>=x){
                System.out.println("Unfair");
            }
            else{
                System.out.println(B-A);
            }
        }
        
        
        
    }
    
}
