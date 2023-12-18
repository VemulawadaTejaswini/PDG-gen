import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		int sum;
		int m;
		
		while(true){
			n = scan.nextInt();
			m = 1000;
			sum = 0;
			if(n == 0)break;
		
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
		}
		System.out.println(sum);
	}
}