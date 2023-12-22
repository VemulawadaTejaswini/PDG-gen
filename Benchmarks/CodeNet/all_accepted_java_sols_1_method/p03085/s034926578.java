import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		char a[] = x.toCharArray();
		if (a[0] == 'A') {
			System.out.println("T");
		} else if (a[0] == 'T') {
			System.out.println("A");
		} else if (a[0] == 'G') {
			System.out.println("C");
		} else {
			System.out.println("G");
		}
	}
}