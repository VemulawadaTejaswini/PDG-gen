import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i = n - 1; i > 1; i--) {
			n = n * i;
		}
		System.out.println(n);
	}
}