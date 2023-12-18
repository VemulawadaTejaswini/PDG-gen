import java.util.Scanner;

public class Main{
	static int n;
	static int[]a;
	static int []bit;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int q = sc.nextInt();
		bit = new int[n + 1];
		a = new int[n + 1];
		for(int i = 0; i < q; i++) {
			int com = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(com == 0) {
				add(x, y);
			}else {
				System.out.println(sum(y) - sum(x - 1));
			}
		}
		sc.close();
	}
	static void add(int a, int w) {
		for(int x = a; x <= n; x += x & -x) {
			bit[x] += w;
		}
	}
	static int sum(int a) {
		int ret = 0;
		for(int x = a; x > 0; x -= x & -x) {
			ret += bit[x];
		}
		return ret;
	}
}

