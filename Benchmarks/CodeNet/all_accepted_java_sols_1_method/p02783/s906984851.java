import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		double h = s.nextDouble();
		double a = s.nextDouble();
		double c = h/a;
		if(h%a!=0) {
			c++;
		}
		System.out.print((short)c);
	}
}