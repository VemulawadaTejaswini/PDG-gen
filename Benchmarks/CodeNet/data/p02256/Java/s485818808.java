import java.util.Scanner;

public class Main {
	
	public static int GCD(int a, int b) {
		int greater;
		int lesser;
		if (a >= b) {
			greater = a;
			lesser = b;
		}
		else {
			greater = b;
			lesser = a;
		}
		if (greater%lesser == 0) {
			return lesser;
		}
		else {
			return GCD(lesser,greater%lesser);
		}
	}
	
	public static void main(String[] args) {
		Scanner comp = new Scanner(System.in);
		int a = comp.nextInt();
		int b = comp.nextInt();
		int result = GCD(a, b);
		comp.close();
		System.out.println(result);
	}
}

