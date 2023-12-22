import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		String ans = ""+ (int) (N + Math.pow(N, 2) + Math.pow(N, 3));
		System.out.println(ans);
	}
}
