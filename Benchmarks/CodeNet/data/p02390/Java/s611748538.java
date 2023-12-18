import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int uhouho = scan.nextInt();
		int h = uhouho / 3600;
		int m = (uhouho - h * 3600) / 60;
		int s = uhouho - 3600 * h - 60 * m;
		System.out.println(h + ":" + m + ":" + s );
	}
}