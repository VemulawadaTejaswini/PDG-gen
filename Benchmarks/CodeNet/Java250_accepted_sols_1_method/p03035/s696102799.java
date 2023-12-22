import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a,b;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		if(a>=6&&a<=12) {
			b = b/2;
		}else if(a<=5) {
			b = 0;
		}
		System.out.println(b);
	}
}