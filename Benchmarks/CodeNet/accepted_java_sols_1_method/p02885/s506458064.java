import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	int resalt = 0;
      
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();

        B = B * 2;
        if ( 1 < A ) {
        	if ( A > B ) {
        		resalt = A - B;
        	}
        	else if(A < B){
        		resalt = 0;
        	}
        }
            System.out.println(resalt);
    }
}
