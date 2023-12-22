import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 180 * n - 360;
		
		System.out.println(ans);
		sc.close();
	}
}
