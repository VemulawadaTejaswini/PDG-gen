
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int A = Integer.parseInt(scan.next());
	int B = Integer.parseInt(scan.next());
	int C = Integer.parseInt(scan.next());
	int D = Integer.parseInt(scan.next());

	System.out.println(A*B > C*D ? A*B : C*D);
	scan.close();
    }
}
