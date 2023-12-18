import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String str = buf.readLine();
		int q = Integer.parseInt(buf.readLine());
		String line;
		String[] part;
		String tmp;
		int a;
		int b;
		
		// scan.nextLine()?????¨for?????????????????¨??????????????????????????????
		for (int i = 0; i < q; i++) {
			line = buf.readLine();
			part = line.split(" ");
			a = Integer.parseInt(part[1]);
			b = Integer.parseInt(part[2]);
			if (part[0].equals("print")) {
				System.out.println(str.substring(a, b+1));
			} else if (part[0].equals("reverse")) {
				tmp = str.substring(a, b+1);
				StringBuffer sbuf = new StringBuffer(tmp);
				tmp = sbuf.reverse().toString();
				str = str.substring(0, a) + tmp + str.substring(b, str.length());
			} else if (part[0].equals("replace")) {
				str = str.substring(0, a) + part[3] + str.substring(b, str.length());
			}
		}
	}

}