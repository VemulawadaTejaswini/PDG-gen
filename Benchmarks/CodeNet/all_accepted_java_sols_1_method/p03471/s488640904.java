import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y_ = sc.nextInt();
		for(int x = 0; x <= n; x++) {
			for(int y = 0; y <= n-x; y++) {
				int z = n-x-y;
				if(y_ == 10000*x + 5000*y + 1000*z) {
					System.out.println(x + " " + y + " " + z);
					return;
				}
			}
		}
		System.out.println("-1 -1 -1");
	}
}