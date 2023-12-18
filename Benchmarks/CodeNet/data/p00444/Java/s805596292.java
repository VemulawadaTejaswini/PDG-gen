import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		int sum = 0;
		int m = 1000;
		
		n = scan.nextInt();
		m -= n;
		
		sum += m / 500;
		m %= 500;
		
		sum += m / 100;
		m %= 100;
			
		sum += m / 50;
		m %= 50;
		
		sum += m / 10;
		m %= 10;
			
		sum += m / 5;
		m %= 5;
		
		sum += m;
		
		System.out.println(sum);
	}
}