import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long A = Long.parseLong(sc.next());
		Long B = Long.parseLong(sc.next());
		Long K = Long.parseLong(sc.next());
		sc.close();

		if(K <= A) {
			A -= K;
			System.out.println(A + " " + B);
			return;
		}else {
			K -= A;
			if(K <= B) {
				B -= K;
				System.out.println(0 + " " + B);
				return;
			}else {
				System.out.println(0 + " " + 0);
				return;
			}
		}

	}
}