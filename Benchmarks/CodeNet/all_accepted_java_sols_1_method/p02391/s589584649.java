import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a>=-1000&&a<=1000&&b>=-1000&&b<=1000)
		{
			if(a<b)
				System.out.println("a < b");
			else if(a>b)
				System.out.println("a > b");
			else System.out.println("a == b");
		
		}
	}
}