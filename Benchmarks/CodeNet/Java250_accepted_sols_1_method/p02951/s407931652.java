import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d=a-b;
		if(c-d>0) System.out.println(c-d);
		else System.out.println("0");

	}

}
