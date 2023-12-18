import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();

		//if(N < 1000) {
		//	System.out.println("ABC" + String.format("%03d", N));
		//}else {
		//	System.out.println("ABD" + String.format("%03d", N - 999));
		//}

		if(N < 1000) {
			System.out.println("ABC");
		}else {
			System.out.println("ABD");
		}
	}
}