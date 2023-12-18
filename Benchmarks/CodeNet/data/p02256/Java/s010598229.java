import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int x = Math.max(a, b);
		int y = Math.min(a, b);
		
		for (int mod = x % y; mod != 0; x = y, y = mod, mod = x % y) {
			
		}
		
    	System.out.println(y);
    	
        sc.close();
	}
}