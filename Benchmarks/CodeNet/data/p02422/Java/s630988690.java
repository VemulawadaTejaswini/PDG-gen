import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			List<String> ret = new ArrayList<String>();
			String str = br.readLine();
			int q = Integer.parseInt(br.readLine());
			int i, j, start, from;
			String com;
			for (i = 0; i < q; i++) {
				String[] line = br.readLine().split(" ");
				com = line[0];
				start = Integer.parseInt(line[1]);
				from = Integer.parseInt(line[2]) + 1;
				if (com.indexOf("replace") != -1) {
					str = str.replace(str.substring(start, from), line[3]);
				} else if (com.indexOf("reverse") != -1) {
					String tmp = "";
					String text = str.substring(start, from);
					for (j = text.length(); j > 0; j--) {
						tmp = tmp + text.charAt(j - 1);
					}
					str = str.substring(0, start) + tmp + str.substring(from, str.length());
				} else if (com.indexOf("print") != -1) {
					ret.add(str.substring(start, from));
				}
			}
			for (String text : ret) {
				System.out.println(text);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}