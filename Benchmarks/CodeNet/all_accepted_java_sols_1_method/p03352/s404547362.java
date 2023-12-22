import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int x = scan.nextInt();
	    scan.close();
	    int pow = 0;
		int ans = 1;
		for (int i = 1; i < x; i++) {
			for (int j = 2; j < x; j++) {
				pow = (int) Math.pow(i, j);
				if (pow <= x) {
					ans = Math.max(ans, pow);
				}
			}
		}
		System.out.println(ans);
	}

}