import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int N = scan.nextInt();

		for(int i = 0; i < N; i++) {
			int a;
			a = scan.nextInt();
			H -= a;
		}

		if(H <= 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}