
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int A = Integer.parseInt(scan.next());
	int B = Integer.parseInt(scan.next());
	
	System.out.println(A % 3 == 0 || B % 3 == 0 || (A+B) % 3 == 0 ? "Possible" : "Impossible");
	scan.close();
    }
}
