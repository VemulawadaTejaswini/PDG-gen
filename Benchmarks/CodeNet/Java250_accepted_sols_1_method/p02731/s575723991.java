import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);
 
		int L = scan.nextInt();
      
      double b = (double) L/3;
      
        double a =0;
        a = b*b*b;
        
        System.out.println(a);
    }
}