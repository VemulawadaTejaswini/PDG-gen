import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		if(a==b) {
			if(b!=c)System.out.println("2");
			else System.out.println("1");
		}else {
			if(a==c)System.out.println("2");
			else if(c==b)System.out.println("2");
			else System.out.println("3");
		}
	}
}