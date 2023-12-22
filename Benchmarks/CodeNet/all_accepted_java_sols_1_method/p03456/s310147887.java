import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a,b;
		a = sc.next();
		b = sc.next();
		String c = a + b;
		int d = Integer.parseInt(c);
		double e = Math.floor( Math.sqrt((double)d) );
		if(e * e == (double)d)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}