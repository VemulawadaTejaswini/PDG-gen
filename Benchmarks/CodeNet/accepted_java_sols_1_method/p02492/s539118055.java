import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String line = br.readLine();
			String[] buf = line.split(" ");
			char[] buf_ch = buf[1].toCharArray();
			if (buf_ch[0] == '?') break;
			int result = 0;
			switch (buf_ch[0]) {
			case '+':
				result = Integer.parseInt(buf[0]) + Integer.parseInt(buf[2]);
				break;
			case '-':
				result = Integer.parseInt(buf[0]) - Integer.parseInt(buf[2]);
				break;
			case '*':
				result = Integer.parseInt(buf[0]) * Integer.parseInt(buf[2]);
				break;
			case '/':
				result = Integer.parseInt(buf[0]) / Integer.parseInt(buf[2]);
				break;
			}
			System.out.println(result);
		}
	}
}