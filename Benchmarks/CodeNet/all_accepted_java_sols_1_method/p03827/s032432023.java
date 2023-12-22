
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int N = Integer.parseInt(scan.next());
	String S = scan.next();

	int x = 0;
	int max = 0;
	for (int i = 0; i < N; i++) {
	    if(S.charAt(i) == 'I') x++;
	    else x--;
	    if(x > max) max = x;
	}

	System.out.println(max);
	scan.close();
    }
}
