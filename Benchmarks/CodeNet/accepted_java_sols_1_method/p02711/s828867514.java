import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		String[] numArray = num.split("");
		Boolean isThere = false;

		for (int i = 0; i < numArray.length; i++) {
			if ("7".equals(numArray[i])) {
				isThere = true;
				break;
			}
		}
		if (isThere) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}