import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();

		int sa = B-A-1;
		if(sa % 2 != 0) {
			System.out.println("Alice");
		}else {
			System.out.println("Borys");
		}
	}

}
