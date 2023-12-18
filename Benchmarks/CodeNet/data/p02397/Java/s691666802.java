import java.util.Scanner;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {

		while (true) {
			int[] val = new int[] { sc.nextInt(), sc.nextInt() };
			if(val[0]==0 &&val[1]==0)break;
			if(val[0]>val[1])swap(val);
			ln(val[0] + " " + val[1]);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}

	public static int[] swap(int[] vals) {
		int tmp = vals[0];
		vals[0] = vals[1];
		vals[1] = tmp;
		return vals;
	}
}