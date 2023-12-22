import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		String[] sArr = s.split("");
		boolean isOk = false;
		for (int i = 0; i < sArr.length; i++) {
			String rolled = "";
			for (int j = i; j < sArr.length+i; j++) {
				if (j < sArr.length) {
					rolled += sArr[j];
				} else {
					rolled += sArr[j - sArr.length];
				}

			}
			if (t.equals(rolled)) {
				isOk = true;
				break;
			}
		}

		if (isOk) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
