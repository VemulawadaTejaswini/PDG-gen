import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d;
		if(c < b){
			d = c;
			c = b;
			b = d;
		}if(b < a){
			d = b;
			b = a;
			a = d;
		}if(c < b){
			d = c;
			c = b;
			b = d;
		}
		System.out.println(a + " " + b + " " + c);
	}
}
