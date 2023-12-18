import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int x = scan.nextInt();
	int y = scan.nextInt();
	if (x < y) {
	    int tmp = y;
	    y = x;
	    x = tmp;
	}
	while (x % y != 0) {
	    int tmp = y;
	    y = x % y;
	    x = tmp;
	}
	System.out.println(gcd(x, y));
    }
    static int gcd (int x, int y) {
	for (int i = x; i > 0; i--) {
	    if (y % i == 0 && x % i == 0) {
		return i;
	    }
	}
	return 1;
    }
}