import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a==1) a+=13;
		if(b==1) b+=13;
		if(a==b) System.out.println("Draw");
		else if(a>b ) System.out.println("Alice");
		else System.out.println("Bob");
		

	}

}
