import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int p = scan.nextInt();
		int q = scan.nextInt();
		int r = scan.nextInt();

		if(p<=q) {
			if(q<=r) System.out.println(p+q);
			else System.out.println(p+r);
		}
		else {
			if(p<=r) System.out.println(p+q);
			else System.out.println(q+r);
		}


	}
}