import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total = 0;
		while (true) {
			if (n < 10) {
				total = n;
				break;
			} else {
				total += 9;
			}
			if (n < 100) {
				break;
			} else if (n < 1000) {
				total += n - 99;
				break;
			} else {
				total += 999 - 99;
			}
			if (n < 10000) {
				break;
			} else if (n < 100000) {
				total += n - 9999;
				break;
			} else {
				total += 99999 - 9999;
				break;
			}
		}
		System.out.println(total);
	}
}
