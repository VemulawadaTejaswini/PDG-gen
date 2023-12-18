import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		char[] v = sc.next().toCharArray();
		for (int i = 0; i < v.length; ++i) {
			v[i] = (char) ((v[i] - 'A' + 23) % 26 + 'A');
		}
		System.out.println(String.valueOf(v));
	}
}