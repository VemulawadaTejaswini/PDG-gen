import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
        
        if (a >= b) {
        	System.out.println("delicious");
        } else if (a < b && x >= b - a) {
        	System.out.println("safe");
        } else {
        	System.out.println("dangerous");
        }
  
    
    
}
}