import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		int c = sc.nextInt();
		
		while (!b.equals("?")) {
			System.out.println(calc(a, b, c));
			a = sc.nextInt();
			b = sc.next();
			c = sc.nextInt();			
		}
	}
	
	public static int calc(int a, String b, int c) {
		int result = 0;
		
		if(b.equals("+")) result = a + c;
		else if (b.equals("-")) result = a - c;
		else if (b.equals("*")) result = a * c;
		else if (b.equals("/")) result = a / c;
		else if (b.equals("?")) result = 0;
		
		return result;
	}

}