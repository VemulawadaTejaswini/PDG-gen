import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double ans = (double) (n - n / 2) / n;
		System.out.println(ans);
		sc.close();
	}

}
