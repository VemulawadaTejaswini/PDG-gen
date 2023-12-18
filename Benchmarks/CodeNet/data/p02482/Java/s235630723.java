import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		int c = a * b;
		int d = 2*a+2*b;
		
		System.out.println(c+" "+d);
	}

}