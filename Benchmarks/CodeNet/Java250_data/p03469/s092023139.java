import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private StringBuilder str;

    public Main() {
	str = new StringBuilder(scan.next());

	scan.close();
    }

    public final void answer() {
	str.setCharAt(3, '8');
	System.out.println(str.toString());
    }
}
