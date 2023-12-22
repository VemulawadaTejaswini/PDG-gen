import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());

		String nn = Integer.toString(N, K);
		System.out.println(nn.length());

	}
}
