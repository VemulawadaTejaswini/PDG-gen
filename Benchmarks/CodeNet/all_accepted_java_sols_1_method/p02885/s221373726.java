import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();
		int check = A - 2 * B;
		if(check > 0) {
			System.out.println(check);
		}else {
			System.out.println(0);
		}
	}
}