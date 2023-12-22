import java.util.Scanner;

class Main{
	static boolean isSQ(int s) {
		int tmp = (int)Math.sqrt(s);
		return tmp * tmp == s;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next(), b = sc.next();
		System.out.println(isSQ(Integer.valueOf(a.concat(b))) ? "Yes" : "No");
	}
}