import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int a = i/100;
		int b = i%100;
		if (a<=12 && a>=1 && b<=12 && b>=1 ) {
			System.out.println("AMBIGUOUS");
		} else if (a<=12 && a>=1) {
			System.out.println("MMYY");
		} else if (b<=12 && b>=1) {
			System.out.println("YYMM");
		} else {
			System.out.println("NA");
		}
	}
}