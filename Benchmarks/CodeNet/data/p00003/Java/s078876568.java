import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;

	int n;
	int a,b,c;

	private void mainrun() {
		scan = new Scanner(System.in);

		n = scan.nextInt();

		for(int i = 0;i < n;i++) {
			looprun();
		}

		scan.close();

	}

	private void looprun() {
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		if(a > c) {
			int tmp = a;
			a = c;
			c = tmp;
		}

		if(b > c) {
			int tmp = b;
			b = c;
			c = tmp;
		}

		String ans = (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2))? "YES": "NO";

		System.out.println(ans);
	}
}
