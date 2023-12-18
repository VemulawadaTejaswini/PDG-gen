import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextInt();
		long b = scan.nextInt();
		int d = (int) (a/b);
		int r = (int) (a%b);
		float f = (float)a/b;
	
		System.out.println(d+" "+r+" "+f);
		
	}

}