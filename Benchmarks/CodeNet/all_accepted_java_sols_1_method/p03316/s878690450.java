import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		
		int N = Integer.parseInt(x);
		int S = 0;
		int a = 0;
		
		for(int i = 0; i < x.length(); i++) {
			a = (int)(N / Math.pow(10, i));
			S += a % 10;
		}
		
		if(N % S == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
