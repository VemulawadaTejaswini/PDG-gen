import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int st = 0;
		if(a > b){
			st = a;
			a = b;
			b = st;
		}
		if(b > c){
			st = b;
			b = c;
			c = st;
		}
		if(a > b){
			st = a;
			a = b;
			b = st;
		}
		System.out.print(a);
		System.out.print(" "+b);
		System.out.println(" "+c);
	}
}