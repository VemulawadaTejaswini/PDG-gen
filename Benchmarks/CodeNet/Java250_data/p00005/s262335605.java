import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			long a = in.nextLong();
			long b = in.nextLong();
			System.out.println(GCD(a, b) + " " + LCM(a, b));
		}
		in.close();
	}

	static long GCD(long a, long b) {//a>b
		if (a < b) {
			long temp = a;
			a = b;
			b = temp;
		}
		if (b == 0) {
			return a;
		} else {
			return GCD(b, a % b);
		}
	}

	static long LCM(long a, long b) {
		return a * b / GCD(a, b);
	}
}