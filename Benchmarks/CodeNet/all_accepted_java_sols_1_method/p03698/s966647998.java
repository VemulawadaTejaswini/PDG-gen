
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		Arrays.sort(c);
		char target = c[0];
		for (int i = 1; i < c.length; i++) {
			if (target == c[i]) {
				System.out.println("no");
				break;
			}else if(i == c.length-1) {
				System.out.println("yes");
				break;
			}else {
				target =c[i];
			}
		}

	}
}


