
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int a = Integer.parseInt(scan.next());
	int b = Integer.parseInt(scan.next());
	int c = Integer.parseInt(scan.next());

	if(a > b) {
	    int tmp = b;
	    b = a;
	    a = tmp;
	}
	if(b > c) {
	    int tmp = c;
	    c = b;
	    b = tmp;
	}
	if(a > b) {
	    int tmp = b;
	    b = a;
	    a = tmp;
	}

	int count = (a == b ? 1 : 2);
	if(b != c) count++;

	System.out.println(count);
	scan.close();
    }
}
