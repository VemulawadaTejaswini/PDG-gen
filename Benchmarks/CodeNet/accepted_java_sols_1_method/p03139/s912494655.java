import java.util.Scanner;

//A	Subscribers
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		int ans1 = Integer.min(A, B);

		int ans2 = 0;
		if (N <= (A + B)) {
			ans2 = (A + B) - N;
		}

		System.out.println(ans1 + " " + ans2);

		sc.close();
	}

}
