import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
                int a;
		int b = 0;
		int c = 0;
		int s = 0;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		if(a>b){
			s = a;
			a = b;
			b = s;
		}
		if(b>c){
			s = b;
			b = c;
			c = s;
		}
		if(a>b){
			s = a;
			a = b;
			b = s;
		}
		System.out.println(a + " " + b + " " + c);
	}
}