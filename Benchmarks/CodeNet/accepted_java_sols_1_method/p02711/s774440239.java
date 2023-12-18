import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String x = input.nextLine();
		boolean lucky = true;
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i)=='7') {
				lucky = false;
				break;
			}
		}
		if (lucky) System.out.println("No");
		else System.out.println("Yes");
	}

}