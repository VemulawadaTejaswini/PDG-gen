import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArray = br.readLine().split(" ");
		int a = Integer.parseInt(strArray[0]);
		int b = Integer.parseInt(strArray[1]);
		if (a >= b) {
			System.out.println(getGCD(a, b));
		} else {
			System.out.println(getGCD(b, a));
		}
	}

	public static int getGCD(int a, int b) {
		if (a % b == 0) return b;
		else if (a < b) {
			return getGCD(b % a, a);
		}
		else return getGCD(b, a % b);
	}
}