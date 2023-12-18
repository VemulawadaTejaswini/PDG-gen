import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		int aa = 1000000007;
		Scanner s = new Scanner(System.in);
		String[] tmp = s.nextLine().split(" ");
		int m = Integer.parseInt(tmp[0]);
		int n = Integer.parseInt(tmp[1]);
		System.out.println(calc(m, n)%aa);
	}

	public static int calc(int m, int n) {

		if(n == 1)
			return m;

		int value = 0;
		if(n%2 == 0) {
			value = calc(m*m, n/2);
		}else {
			value = calc(m*m, n/2) * m;
		}

		return value;
	}

}