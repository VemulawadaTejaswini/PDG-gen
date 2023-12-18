import java.util.Scanner;
class Main {
	int x,n = 0,a,b,c,d,e;
	public void pr() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n >= 3 && n <= 10000) {
			for(x = 3; x <= n;x++) {
				a = x % 3;
				b = x % 10;
				c = x / 10;
				d = x / 100;
				e = x / 1000;
				if(a == 0 || b == 3 || c == 3 || c % 10 == 3 || d == 3 || d % 10 == 3 || e == 3 || e % 10 == 3) {
					System.out.print(" " + x);
				}
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		new Main().pr();
	}
}