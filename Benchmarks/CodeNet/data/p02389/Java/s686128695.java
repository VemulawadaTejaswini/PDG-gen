import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c,d;
		c=a*b;
		d=a*2+b*2;
		System.out.println(d+""+c);
		scan.close();
	}
	
}

