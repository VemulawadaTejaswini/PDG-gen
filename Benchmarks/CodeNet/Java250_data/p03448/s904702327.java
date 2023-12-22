import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int x = scan.nextInt();
		System.out.println(ans(a, b, c, x));
	}
	static int ans(int a , int b, int c , int x) {
		int ans = 0;
		for(int i = 0; i <= a; i++) {
			for(int j = 0; j <= b; j++) {
				for(int k = 0; k <= c; k++) {
					int work = i * 500 + j * 100 + k * 50;
					if(work == x) ans++;
				}
			}
		}
		return ans;
	}
}
