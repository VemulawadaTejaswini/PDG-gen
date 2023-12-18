import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		int a,b;
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			a = in.nextInt();
			b = in.nextInt();
			System.out.println(GCD(a, b) + " " + LCM(a, b));
		}
		in.close();
	}

	static int GCD(int a, int b) {//a>b
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if (b == 0) {
			return a;
		} else {
			return GCD(b, a % b);
		}
	}

	static int LCM(int a, int b) {
		return a * b / GCD(a, b);
	}
}