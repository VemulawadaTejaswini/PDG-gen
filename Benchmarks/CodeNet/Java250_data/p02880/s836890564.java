import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i <  9; i++) {
			int mod =N % (i + 1);
			int div = N / (i + 1);
			
			if (mod == 0 && div < 10) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}