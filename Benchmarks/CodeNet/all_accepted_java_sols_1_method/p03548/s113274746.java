import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int ans = x / (y + z);
		int tmp = x % (y + z);
		if (tmp < z) {
			ans--;
		}
		System.out.println(ans);
	}
}