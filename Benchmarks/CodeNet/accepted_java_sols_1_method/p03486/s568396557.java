import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String output = "No";

		Scanner scanner = new Scanner(System.in);

		String s = scanner.nextLine();
		String t = scanner.nextLine();

		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();

		Character[] td = new Character[tChar.length];

		for(int i = 0,len = tChar.length;i<len;i++) {
			td[i]= Character.valueOf(tChar[i]);
		}

		Arrays.sort(sChar);
		Arrays.sort(td, Collections.reverseOrder());

		s = String.valueOf(sChar);

		for(int i = 0,len = tChar.length;i<len;i++) {
			tChar[i]= td[i].charValue();
		}

		t = String.valueOf(tChar);


		if(s.compareTo(t) <= -1)
			output ="Yes";

		System.out.println(output);

		scanner.close();
	}

}