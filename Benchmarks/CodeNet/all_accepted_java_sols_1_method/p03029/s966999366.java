import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = Integer.parseInt(sc.next());
		int P = Integer.parseInt(sc.next());
		System.out.println((A*3+P)/2);
	}
}