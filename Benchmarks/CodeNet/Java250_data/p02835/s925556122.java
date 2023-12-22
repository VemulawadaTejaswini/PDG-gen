
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a1 = Integer.parseInt(sc.next());
		int a2 = Integer.parseInt(sc.next());
		int a3 = Integer.parseInt(sc.next());
		
		System.out.println((a1+a2+a3) >= 22 ? "bust": "win");
	}
}