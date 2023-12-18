import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		//System.out.print("???????????°????????\??????");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		int a = Integer.parseInt(str);
		
		str = scan.next();
		int b = Integer.parseInt(str);
		
		int area = a * b;
		int perimeter = 2 * (a + b);
		
		System.out.println(area + " " + perimeter);
	}
}