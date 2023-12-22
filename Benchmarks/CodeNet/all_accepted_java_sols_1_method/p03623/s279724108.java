import java.util.Scanner;

public class Main {
	public static void main(String[] argvs) {
    	Scanner sc = new Scanner(System.in);
      	int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int A = Math.abs(x - a);
        int B = Math.abs(x - b);
      
        if (A < B) {
        	System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}