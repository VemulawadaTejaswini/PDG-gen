import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		double money = 100000;
		final int c = 1000;
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			money = money + money * 0.05;
			money = Math.ceil(money / c) * c; 
		}
		System.out.println((int)money);
		
	}	
}