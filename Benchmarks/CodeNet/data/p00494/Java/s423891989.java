import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] str = sc.next().toCharArray();

		int i = 0;
		int ans = 0;
		while (true) {
			int J = 0;
			int O = 0;
			int I = 0;
			while (str[i] == 'J') {
				i++;
				J++;
				if (i == str.length)
					break;
			}
			if (i == str.length) {
				break;
			}
			while (str[i] == 'O') {
				i++;
				O++;
				if (i == str.length)
					break;
			}
			if (i == str.length)
				break;
			while (str[i] == 'I') {
				i++;
				I++;
				if (i == str.length)
					break;
			}if(O<=J&&O<=I)
			ans = Math.max(ans, Math.min(I, Math.min(O, J)));
			if (i == str.length)
				break;
		//	System.out.println(J + " " + O + " " + I);
		}
		System.out.println(ans);
	}
}