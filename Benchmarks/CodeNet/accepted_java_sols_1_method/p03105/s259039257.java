import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		if(a>b) System.out.println("0");
		else if(a*c<=b) System.out.println(c);
		else System.out.println(b/a);

	}

}
