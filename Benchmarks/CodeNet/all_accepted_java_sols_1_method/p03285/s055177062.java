import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		final int cake = 4;
		final int donut = 7;
		
		N = N % (cake * donut);
		if(N % 7 % cake <= N / donut)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}