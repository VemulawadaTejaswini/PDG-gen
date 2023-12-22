
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());

		if(A+B == 3) {
			System.out.println(3);
		} else if(A+B == 4) {
			System.out.println(2);
		} else {
			System.out.println(1);
		}
	}
}