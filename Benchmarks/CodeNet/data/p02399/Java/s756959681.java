import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//System.out.print (a / b + " ");
		//System.out.print (a % b + " ");
		
		double ab = (float)a / b;
		
		String A = Integer.toString(a);
		String B = Integer.toString(b);
		String AB = Double.toString(ab);
		
		System.out.println(String.format("%d %d %e", a/b, a%b, ab));
		//System.out.println(String.format("%s %s %s", A, B, AB));
		
	sc.close();
	}
}