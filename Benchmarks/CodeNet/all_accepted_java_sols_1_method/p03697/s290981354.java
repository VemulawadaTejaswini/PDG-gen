
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int A = Integer.parseInt(scan.next());
	int B = Integer.parseInt(scan.next());

	int total = A + B;
	String ans = (total >= 10 ? "error" : String.valueOf(total));
	
	System.out.println(ans);
	scan.close();
    }
}
