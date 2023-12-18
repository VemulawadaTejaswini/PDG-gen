import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a >= b){
			int x = b;
			b = a;
			a = x;
		}
		if(b >= c){
			int x = c;
			c = b;
			b = x;
		}
		if(a >= b){
			int x = b;
			b = a;
			a = x;
		}
		System.out.print(a);
		System.out.print(" ");
		System.out.print(b);
		System.out.print(" ");
		System.out.println(c);
	}
}