import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String sa = br.readLine() + " ";
		String sb = br.readLine() + " ";
		String sc = br.readLine() + " ";
		int sai = 0;
		int sbi = 0;
		int sci = 0;
		char prec = 'a';

		label: while (true) {
			switch (prec) {
			case 'a':
				if (sa.charAt(sai) == ' ')
					break label;
				prec = sa.charAt(sai++);
				break;
			case 'b':
				if (sb.charAt(sbi) == ' ')
					break label;
				prec = sb.charAt(sbi++);
				break;
			case 'c':
				if (sc.charAt(sci) == ' ')
					break label;
				prec = sc.charAt(sci++);
				break;
			default:
			}
		}

		System.out.println((char) (prec - 32));

	}

}
