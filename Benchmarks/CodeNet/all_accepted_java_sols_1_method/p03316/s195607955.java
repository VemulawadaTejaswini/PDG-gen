import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		final int N = n;

		int s = 0;
		for (;n>0;n/=10){
			s += n%10;
		}

		if (N%s==0){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}