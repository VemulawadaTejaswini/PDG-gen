import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		int nico = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < nico; i++) {
			String n0 = sc.nextLine();
			String n1 = sc.nextLine();
			String ans = "";
			
			int lim = n0.length();
			if (lim < n1.length()) lim = n1.length();
			
			int c = 0;
			for (int j = 0; j < lim; j++) {
				int a = 0;
				int b = 0;
				
				if (j < n0.length()) {
					a = n0.charAt(n0.length() - j - 1) - '0';
				}
				if (j < n1.length()) {
					b = n1.charAt(n1.length() - j - 1) - '0';
				}
				
				int sum = a + b + c;
				if (sum > 9) {
					sum = sum - 10;
					c = 1;
				} else {
					c = 0;
				}
				
				ans = sum + ans;
			}
			if (c == 1) ans = c + ans;
			
			if (ans.length() > 80) {
				System.out.println("overflow");
			} else {
				System.out.println(ans);
			}
		}
	}
}