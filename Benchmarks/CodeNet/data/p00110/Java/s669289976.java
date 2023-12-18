import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.text.ParseException;

public class Main {

	public static final String MASK = "X";

	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		MessageFormat format = new MessageFormat("{0}+{1}={2}");

		while ((line = br.readLine()) != null) {
			Object[] o = format.parse(line);
			String strl = (String) o[0];
			String strr = (String) o[1];
			String stra = (String) o[2];

			int start, count;
			start = count = 0;
			if (strl.startsWith(MASK) || strr.startsWith(MASK)
					|| stra.startsWith(MASK)) {
				start = 1;
			}

			for (int i = start; i <= 9; i++) {
				String replace = Integer.toString(i);
				Long lngl = Long.parseLong(strl.replace(MASK, replace));
				Long lngr = Long.parseLong(strr.replace(MASK, replace));
				Long lnga = Long.parseLong(stra.replace(MASK, replace));
				if (lngl + lngr == lnga) {
					System.out.println(replace);
					count++;
				}
			}
			if (count == 0)
				System.out.println("NA");
		}
	}
}