import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();
		String ans = "";
		for(int x = 0; x <= N; x++) {
			for(int y = 0; y <= N; y++) {
				int z = N - x - y;
				if(z < 0) {
					break;
				}
				int sum = 10000 * x + 5000 * y + 1000 * z;
				if(sum == Y) {
					ans = x + " " + y + " " + z;
				}
			}
		}
		if(ans == "") {
			System.out.println("-1 -1 -1");
		}else {
			System.out.println(ans);
		}
	}
}