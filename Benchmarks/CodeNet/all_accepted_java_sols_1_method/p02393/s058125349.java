import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		if(a > b){
			int x;
			x = a;
			a = b;
			b = x;
		}

		if(b > c){
			int x;
			x = b;
			b = c;
			c = x;
		}

		if(a > b){
			int x;
			x = a;
			a = b;
			b = x;
		}

		System.out.println(a + " " + b + " " + c);
	}
}