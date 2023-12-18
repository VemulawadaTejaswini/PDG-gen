import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		if (line.equals("A")) {
			System.out.println("T");
		} else if (line.equals("T")) {
			System.out.println("A");
		} else if (line.equals("G")) {
			System.out.println("C");
		} else {
			System.out.println("G");
		}
		in.close();
	}

}
