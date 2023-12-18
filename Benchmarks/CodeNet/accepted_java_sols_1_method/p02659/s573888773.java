import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = Long.parseLong(sc.next());
		double b = Double.parseDouble(sc.next());
		long c = (long)Math.round(b*100);
		a = a * c;
		a /= 100;
		System.out.println(a);
		
	}


}
