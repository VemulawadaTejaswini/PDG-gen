import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int x = scan.nextInt();
	int y = scan.nextInt();
	int gcd = 0;
	if (x > y) {
	    gcd = gcd(y, x%y);
	} else {
	    gcd = gcd(x, y%x);
	}
	System.out.println(gcd);
    }
    static int gcd (int x, int y) {
	for (int i = y; i > 0; i--) {
	    if (y % i == 0 && x % i == 0) {
		return i;
	    }
	}
	return 1;
    }
}