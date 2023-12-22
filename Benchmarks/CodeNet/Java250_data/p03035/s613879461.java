import java.util.Scanner;

class Main{
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int c;
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		if(a>=13)
			c = b;
		else if(a<=5)
			c = 0;
		else
			c = b/2;
		System.out.print(c);
	}
}