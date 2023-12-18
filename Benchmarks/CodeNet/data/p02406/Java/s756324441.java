import java.util.Scanner;
import java.lang.Math;
public class Main{
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.next());
	call(n);
    }
    public static void call(int n) {
	for (int i = 1; i <= n; i++) {
	    if (i % 3 == 0) {
		System.out.print(" " + i);
		continue;
	    }
	    include3(i);
	}
	System.out.println();
    }
    public static void include3(int i) {
	int x = i;
	while (x > 0) {
	    if (x % 10 == 3) {
		System.out.print(" " + i);
		return;
	    }
	    x /= 10;
	}
    }
}