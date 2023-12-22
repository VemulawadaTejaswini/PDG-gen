import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		int ans = com(n, 2) + com(m, 2);

		System.out.println(ans);

	}
	public static int com(int a, int b) {
		if(a < b)
			return 0;

		int res;

		res = 1;
		int i;
		for(i = 0; i < b; i++) {
			res = res * (a - i);
		}
		for(i = 1; i <= b; i++) {
			res = res / i;
		}

		return res;
	}
}