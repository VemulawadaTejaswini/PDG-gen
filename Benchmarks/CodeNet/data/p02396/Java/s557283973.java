import java.util.Scanner;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int i = 1;
		while (true) {
			int n = sc.nextInt();
			if (n == 0) return;
			System.out.println("Case "+i+": "+n);
			i++;
			
		}
		
	}
}
