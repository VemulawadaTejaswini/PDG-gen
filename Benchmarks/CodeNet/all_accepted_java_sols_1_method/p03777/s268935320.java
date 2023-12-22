
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	boolean a = (scan.next().charAt(0) == 'H' ? true : false);
	boolean b = (scan.next().charAt(0) == 'H' ? true : false);
	boolean status = a ? b : !b;

	System.out.println(status ? "H" : "D");
	scan.close();
    }
}
