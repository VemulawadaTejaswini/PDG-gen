import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int X = (int)Math.ceil(N/1.08);
		int taxedX = (int)(X * 1.08);
		if (taxedX == N ){
			System.out.print(X);
		}else {
			System.out.print(":(");
		}
	}
}
