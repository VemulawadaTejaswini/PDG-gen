import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int d = a/b;
		int r = a%b;
		double aa = a;
		double bb = b;
		double f = aa/bb;
		String s = String.format("%.5f",f);
		System.out.println(d+" "+r+" "+s);
	}
}

