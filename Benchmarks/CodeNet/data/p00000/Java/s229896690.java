import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] a) {
		for (int i = 1; i <= 9; ++i) {
			for (int j = 1; j <= 9; ++j) {
				print(i + "x" + j + "=" + i * j);
			}
		}
	}
	
	public static void print(Object out) {
		System.out.println(out);
	}
}