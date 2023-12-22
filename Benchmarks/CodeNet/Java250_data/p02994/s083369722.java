import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int c = 0;
		int d = 1;
		int x = 0;
		boolean v = true;
		int e[] = new int[n];
		for (int i = 0; n > i; i++) {
			c = l + d -1;
			d = d+1;
			e[i] = c;
			x = x + c;
			if(c == 0) {
				v  = false;
			}
		}
		if(v == false) {
			System.out.println(x);
		}else {
			if(l >= 0) {
				System.out.println(x - e[0]);
			}else {
				System.out.println(x - e[n-1]);
			}
		}
	}
}