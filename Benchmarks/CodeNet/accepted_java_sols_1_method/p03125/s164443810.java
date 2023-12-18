import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
			int X = 0;
	       if(b % a ==0){
	        	X= a + b;
	        }else {
	        	X= b - a;
	        }
	        
	        System.out.println(X);
	}
}