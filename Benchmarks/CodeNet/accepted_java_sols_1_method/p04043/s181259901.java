import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int count_5 = 0;
		int count_7 = 0;
		if(a == 5) {
			count_5++;
		} else if(a == 7) {
			count_7++;
		}
		if(b == 5) {
			count_5++;
		} else if(b == 7) {
			count_7++;
		}
		if(c == 5) {
			count_5++;
		} else if(c == 7) {
			count_7++;
		}
		if(count_5 == 2 && count_7 == 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}