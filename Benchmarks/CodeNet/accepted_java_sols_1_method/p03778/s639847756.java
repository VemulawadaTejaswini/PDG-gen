
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	long W = Long.parseLong(scan.next());
	long a = Long.parseLong(scan.next());
	long b = Long.parseLong(scan.next());

	long ans = 0;
	if(a+W < b) ans = b - (a+W);
	else if(b+W < a) ans = a - (b+W);
	
	System.out.println(ans);
	scan.close();
    }
}
