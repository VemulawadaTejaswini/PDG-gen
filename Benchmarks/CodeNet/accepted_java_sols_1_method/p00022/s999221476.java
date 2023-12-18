import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int n, a;
	long sum, max;
	while (true) {
	    n = Integer.parseInt(scan.nextLine());
	    if (n == 0) {
		break;
	    }
	    sum = 0;
	    max = Long.MIN_VALUE;
	    for (int i = 0; i < n; i++) {
		a = Integer.parseInt(scan.nextLine());
		sum = Math.max((sum + a), a);
		max = Math.max(sum, max);
	    }
	    System.out.println(max);
	}
    }
}