import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner scan = new Scanner(System.in);        
        String As = scan.next();
        String Bs = scan.next();
        String Cs = scan.next();

	    int A = Integer.parseInt(As);
	    int B = Integer.parseInt(Bs);
 	    int C = Integer.parseInt(Cs);

        if(A==B){
            if(A==C){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }else if(B==C || A==C){
                System.out.println("Yes");
        }else{
                System.out.println("No");
        }
        
    }
}