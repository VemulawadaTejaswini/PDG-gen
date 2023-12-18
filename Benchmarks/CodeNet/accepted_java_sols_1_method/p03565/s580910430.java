import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String inputS = sc.next();
		String inputT = sc.next();
		String[] inputStringS = inputS.split("");
		String[] inputStringT = inputT.split("");
		int resPotision = -1;
		loop: for (int i = inputStringS.length - inputStringT.length; i >= 0; i--) {
			boolean judge = true;
			for (int j = 0; j < inputStringT.length; j++) {
				if (!"?".equals(inputStringS[i + j]) && !inputStringT[j].equals(inputStringS[i + j])) {
					judge = false;
					break;
				} else {
					continue;
				}
			}
			if (judge) {
				resPotision = i;
				break loop;
			}
		}
		if (resPotision >= 0) {
			for (int i = resPotision; i < inputStringT.length + resPotision; i++) {
				inputStringS[i] = inputStringT[i - resPotision];
			}
			for (int i = 0; i < inputStringS.length; i++) {
				if ("?".equals(inputStringS[i])) {
					System.out.print("a");
				} else {
					System.out.print(inputStringS[i]);
				}
			}
		} else {
			System.out.print("UNRESTORABLE");
		}
	}
}
