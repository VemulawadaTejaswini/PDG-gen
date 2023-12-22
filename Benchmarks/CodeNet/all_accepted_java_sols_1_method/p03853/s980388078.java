
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int H = Integer.parseInt(scan.next());
	int W = Integer.parseInt(scan.next());
	StringBuilder str = new StringBuilder(H*W);
	for(int i=0; i<H; i++) {
	    String s = scan.next();
	    str.append(s + '\n' + s + '\n');
	}
	System.out.println(str.toString());
	scan.close();
    }
}
