import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		int h;
		int m;
		int s;
		
		h = (int)Math.floor(x / 3600);
		x = x % 3600;
		m = (int)Math.floor(x / 60);
		x = x % 60;
		s = (int)x;
		System.out.println(h + ":" + m + ":" + s);
	}
}