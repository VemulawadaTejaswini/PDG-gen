import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int l;
		int a, b, c, d;
		int dayJ = 0, dayM = 0;
		
		l = scan.nextInt();
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		
		if(a%c == 0)dayJ = a / c;
		else dayJ = a / c + 1;
		
		if(b%d == 0)dayM = b / d;
		else dayM = b / b + 1;
		
		System.out.println((l - (dayJ + dayM)));
	}
}