import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int x = N/100;
		
		if(N <= 100*x + 10*x + x) {
			System.out.println((100*x + 10*x + x));
		}else {
			System.out.println((100*(x+1) + 10*(x+1) + (x+1)));
		}
		
		
	}
}
