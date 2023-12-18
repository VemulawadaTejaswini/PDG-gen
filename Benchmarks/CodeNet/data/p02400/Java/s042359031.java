import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		sc.close();
		
		String m = String.format("%.6f", r * r * Math.PI);
		String s = String.format("%.6f", r * 2 * Math.PI);
		
		System.out.println(m + " " + s);
		
	}

}