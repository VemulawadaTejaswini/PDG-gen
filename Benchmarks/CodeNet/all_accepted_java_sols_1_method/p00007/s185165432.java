import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double p = 100000;
		int n = s.nextInt();
		for(int i = 0; i < n; ++i) {
			p *= 1.05;
			p = Math.ceil(p / 1000) * 1000;
		}
		System.out.println((int)p);
	}
}