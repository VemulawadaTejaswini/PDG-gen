
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());

		if(N == M) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}