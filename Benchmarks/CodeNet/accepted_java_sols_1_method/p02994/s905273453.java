import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int A = scan.nextInt();
		int L = A;
		int R = A + N - 1;
		int eat = 0;

		if(R <= 0) {
			eat = R;
		}else if(L >= 0) {
			eat = L;
		}else {
			eat = 0;
		}

		int ans = (R + L) * (R - L + 1)/2 - eat;

		System.out.println(ans);
	}
}