import java.util.Scanner;

public class Main {
	
	public static void main(String... ac) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), d = sc.nextInt(), x = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			int a = sc.nextInt();
			
			x += (d + a - 1) / a;
			
		}
		
		System.out.println(x);
		
	}
	
}