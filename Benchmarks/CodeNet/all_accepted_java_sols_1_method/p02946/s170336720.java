import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();
		int Y = X;
		for(X=X-(K-1);X<Y;X++) {
			System.out.print(X+" ");
		}
		for(X=Y;X<(Y+K);X++) {
			System.out.print(X+" ");
		}
	}

}
