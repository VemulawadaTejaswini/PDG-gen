import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = a + b;
		int e;
		e = Integer.parseInt(c);
		if ((int)Math.sqrt(e)*Math.sqrt(e) !=e)
			System.out.print("No");
		else
			System.out.println("Yes");

	}

}