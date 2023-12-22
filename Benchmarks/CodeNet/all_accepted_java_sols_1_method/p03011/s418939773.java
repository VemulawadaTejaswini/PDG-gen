import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int P=Integer.parseInt(sc.next());
		int Q=Integer.parseInt(sc.next());
		int R=Integer.parseInt(sc.next());

		int a = P+Q;
		int b = Q+R;
		int c = R+P;
		System.out.println(Math.min(a, Math.min(b, c)));

	}
}
