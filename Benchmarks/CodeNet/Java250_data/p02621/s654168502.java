import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		System.out.println(a + a*a + a*a*a);
		sc.close();
	}
}