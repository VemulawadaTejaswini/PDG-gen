
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int N = Integer.parseInt(scan.next());

	int x = N * 800;
	int y = 200 * (N / 15);

	System.out.println(x - y);
	scan.close();
    }
}
