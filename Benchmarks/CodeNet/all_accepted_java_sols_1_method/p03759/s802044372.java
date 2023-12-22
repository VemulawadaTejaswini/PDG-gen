
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int a = Integer.parseInt(scan.next());
	int b = Integer.parseInt(scan.next());
	int c = Integer.parseInt(scan.next());

	System.out.println(b-a == c-b ? "YES" : "NO");
	scan.close();
    }
}
