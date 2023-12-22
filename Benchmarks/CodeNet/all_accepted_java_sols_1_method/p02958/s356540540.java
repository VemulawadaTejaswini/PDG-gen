import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int count = 0;

		for(int i = 1; i <= N; i++) {
			int p = scan.nextInt();
			if(p != i) {
				count++;
			}
		}

		System.out.println(count <= 2? "YES": "NO");
	}

}