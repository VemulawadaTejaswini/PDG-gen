import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		if(N == 1) {
			System.out.println(1);
		} else if(N % 2 == 1) {
			System.out.println((N/2)+1);
		} else {
			System.out.println((N/2));
		}
	}
}
