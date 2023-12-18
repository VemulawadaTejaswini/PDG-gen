import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		scan.close();
		int min_fee;
		if(a>b)min_fee=b;
		else min_fee=a;
		
		System.out.println((c>d)? min_fee+d:min_fee+c);
	}
}
