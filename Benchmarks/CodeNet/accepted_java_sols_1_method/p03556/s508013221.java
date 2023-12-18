import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double d = Math.sqrt(n);
		int ans = (int)d * (int)d;
		System.out.println(ans);
	}
}
