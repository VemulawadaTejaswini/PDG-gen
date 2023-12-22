import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = 0;
		int d = 0;
		int aa = a;
		while(aa>0) {
			aa--;
			c += b*Math.pow(10,aa);
			
		}
		while(b>0) {
			b--;
			d += a*Math.pow(10,b);
		}
		System.out.println(Math.max(c, d));
	}
}
