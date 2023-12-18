import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			String str = input.readLine();
			int n = Integer.parseInt(input.readLine());
			for (int i = 0; i < n; i++) {
				String[] line = input.readLine().split(" ");
				String command = line[0];
				int begin = Integer.parseInt(line[1]);
				int end = Integer.parseInt(line[2]) + 1;
				if (command.equals("print")) {
					System.out.println(str.substring(begin, end));
				} else if (command.equals("reverse")) {
					if (begin == 0) {
						str = new StringBuffer(str.substring(0, end)).reverse().toString().concat(str.substring(end));
					} else if (end == str.length()) {
						str = str.substring(0, begin).concat(new StringBuffer(str.substring(begin)).reverse().toString());
					} else {
						str = str.substring(0, begin).concat(new StringBuffer(str.substring(begin, end)).reverse().toString()).concat(str.substring(end));
					}
				} else if (command.equals("replace")) {
					if (begin == 0) {
						str = line[3].concat(str.substring(end));
					} else if (end == str.length()) {
						str = str.substring(0, begin).concat(line[3]);
					} else {
						str = str.substring(0, begin).concat(line[3]).concat(str.substring(end));
					}
				}
			}
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}