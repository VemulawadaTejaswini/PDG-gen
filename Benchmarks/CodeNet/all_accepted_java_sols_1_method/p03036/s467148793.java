import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int r,d,x;

		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		d = sc.nextInt();
		x = sc.nextInt();
		for(int i=0;i<10;i++) {
			System.out.println(r*x-d);
			x = r*x-d;
		}
		
	}
}