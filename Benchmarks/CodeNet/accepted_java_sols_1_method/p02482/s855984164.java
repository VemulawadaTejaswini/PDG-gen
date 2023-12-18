import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a<b)
			System.out.println("a < b");
		if(a>b)
			System.out.println("a > b");
		if(a==b)
			System.out.println("a == b");
	}
}