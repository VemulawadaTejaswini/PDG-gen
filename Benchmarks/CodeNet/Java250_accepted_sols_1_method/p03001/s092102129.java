import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		double s = ((double)w*(double)h)/2;
		if (w%2==0&&h%2==0) {
			if (w/2==x&&y==h/2) {
				System.out.println(s+" "+1);
			} else {
				System.out.println(s+" "+0);
			}
		} else {
			System.out.println(s+" "+0);
		}
	}
}