
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int X = Integer.parseInt(scan.next());
	int A = Integer.parseInt(scan.next());
	int B = Integer.parseInt(scan.next());

	int days = B - A;
	String ans = (days <= 0 ? "delicious" : (days <= X ? "safe" : "dangerous"));

	System.out.println(ans);
	scan.close();
    }
}
