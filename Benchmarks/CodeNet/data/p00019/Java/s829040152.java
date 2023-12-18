import java.util.Scanner;
class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int n = in.nextInt();
			int ans = 1;
			for(int i = 2; i <= n; i++) ans*=i;
			System.out.println(ans);
		}
	}
}