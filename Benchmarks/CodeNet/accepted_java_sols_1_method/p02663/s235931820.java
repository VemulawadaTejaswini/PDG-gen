import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H1 = Integer.parseInt(sc.next());
		int M1 = Integer.parseInt(sc.next());
		int H2 = Integer.parseInt(sc.next());
		int M2 = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		sc.close();

		int total = 0;
		if(M1 <= M2) {
			total = 60 * (H2 - H1) + (M2 - M1);
		}else {
			total = 60 * (H2 - H1 - 1) + (60 + M2 - M1);
		}

		if(total - K > 0) {
			System.out.println(total - K);
		}else {
			System.out.println(0);
		}
	}

}
