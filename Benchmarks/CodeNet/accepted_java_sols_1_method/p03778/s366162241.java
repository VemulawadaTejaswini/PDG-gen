import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();

		if(a<b)System.out.println((a+w<b)? b-(a+w):"0");
		else System.out.println((b+w<a)? a-(b+w):"0");
	}
}