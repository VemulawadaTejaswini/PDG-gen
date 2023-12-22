import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanNum = new Scanner(System.in);
		int a = scanNum.nextInt();
		int b = scanNum.nextInt();
		int c = scanNum.nextInt();
		int ch;
		if (a>b) {
			ch=a;
			a=b;
			b=ch;
		}
		if (b>c) {
			ch=b;
			b=c;
			c=ch;
		}
		if (a>b) {
			ch=a;
			a=b;
			b=ch;
		}
		System.out.println(a+" "+b+" "+c);
	}
}