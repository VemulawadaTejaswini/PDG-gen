import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		if(N==1) {
			System.out.println("Hello World");
		}
		else if(N==2) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			System.out.println(a+b);
		}

	}

}
