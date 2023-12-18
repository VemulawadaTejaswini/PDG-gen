import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Input
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());

		//Output
		System.out.println(N-K+1);
	}

}
