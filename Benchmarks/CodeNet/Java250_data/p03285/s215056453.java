import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}
	
	public void solve(Scanner sc) {
		int n = Integer.parseInt(sc.next());
		
		if(n % 7 == 0 || n % 4 == 0) {
			System.out.println("Yes");
			return;
		}
		
		for(int i=0; i*7 <= n; i++) {
			for(int j=0; j*4+i*7 <= n; j++) {
				if(j*4+i*7==n) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}
