import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int oddcounter = 0;
		for (int i = 0; i < N; i++) {
			if (sc.nextInt() % 2 != 0) {
				oddcounter++;
			}
		}
		if(oddcounter%2==0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}