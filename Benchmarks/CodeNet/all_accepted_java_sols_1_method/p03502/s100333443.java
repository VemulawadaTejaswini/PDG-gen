import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cap = N;
		int fx = 0;
		for(int i = (int)Math.log10(N);i >= 0;--i) {
			fx += cap / Math.pow(10, i);
			cap = cap % (int)Math.pow(10, i);
		}
		
		if(N % fx == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();
	}
}