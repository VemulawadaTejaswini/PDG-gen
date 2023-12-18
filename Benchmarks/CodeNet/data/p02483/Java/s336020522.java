import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = 0;
		if(a > b){
			d = a;
			a = b;
			b = d;
		}
		if(b > c){
			d = b;
			b = c;
			c = d;
		}
		if(a > b){
			d = a;
			a = b;
			b = d;
		}
		System.out.print(a);
		System.out.print(" ");
		System.out.print(b);
		System.out.print(" ");
		System.out.println(c);
	}
}