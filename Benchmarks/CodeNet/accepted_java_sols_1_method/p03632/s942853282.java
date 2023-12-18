import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int t = 0;
		if(b <= c || d <= a) {
		} else if(a <= c && c <= b) {
			if(b <= d) {
				t = b - c;
			} else if(d <= b) {
				t = d - c;
			}
		} else if(c <= a) {
			if(b <= d) {
				t = b - a;
			} else if(d <= b) {
				t = d - a;
			}
		}
		System.out.println(t);
	}
}