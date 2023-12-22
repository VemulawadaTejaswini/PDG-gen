import java.util.Scanner;
     
public class Main {
    	
    private final static Scanner sc = new Scanner(System.in);
    	
    public static void main(String[] arg) {
    	int A = sc.nextInt() - 1;
      	int B = sc.nextInt() - 1;
      	int k = (B / A);
      	if( k*A != B) k++;
      	System.out.println(k);
   	}
}