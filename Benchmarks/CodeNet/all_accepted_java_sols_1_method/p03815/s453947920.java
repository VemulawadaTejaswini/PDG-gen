
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	long x = Long.parseLong(scan.next());

	long ans;
	long a = x / 11;
	if(a == 0) {
	    ans = (x > 6 ? 2 : 1);
	} else {
	    ans = 2 * a;
	    long b = x % 11;
	    if(b != 0) ans += (b > 6 ? 2 : 1);
	}
	
	System.out.println(ans);
	scan.close();
    }
}
