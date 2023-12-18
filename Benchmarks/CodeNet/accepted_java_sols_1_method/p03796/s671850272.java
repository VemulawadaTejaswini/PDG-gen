
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
	int N = Integer.parseInt(scan.next());

	long result = 1;
	for (int i = 1; i <= N; i++) {
	    result = (result * i) % MOD;
	}

	System.out.println(result);
	scan.close();
    }
}
