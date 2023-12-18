import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		double a = n.nextInt();
		double b = n.nextInt();
		double c = a/b*1.00000;
		System.out.println((int)(a/b));
		System.out.println((int)(a%b));
		System.out.println(c);
	}
}