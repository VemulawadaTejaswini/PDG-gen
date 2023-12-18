import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		boolean f = false;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((4*i)+(7*j) == n) {
					f = true;
					System.out.println("Yes");
					return;
				} 
			}
		}
		System.out.println("No");
	}
}
