
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int maxHigh = 0;
		int view = 0;
		for(int i = 0; i < N; i++) {
			int High = sc.nextInt();
			if(maxHigh <= High) {
				maxHigh = High;
				view++;
			}
		}
		System.out.println(view);
	}

}
