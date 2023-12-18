import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		long f = 1;
		for(int i = 1; i <= n; i++) {
			f = f * i;
		}
		System.out.println(f);
	}
}