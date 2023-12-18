import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str ;
		String str2 = br.readLine();
		int a;
		int b;
		int num = Integer.parseInt(br.readLine());
		StringBuffer sb1 = new StringBuffer(str2);

		for (int i = 0; i < num; i++) {
			String[] str3 = br.readLine().split(" ");
			a = Integer.parseInt(str3[1]);
			b = Integer.parseInt(str3[2]);

			if (str3[0].equals("print")) {
				System.out.println(str2.substring(a, b + 1));
			}else if (str3[0].equals("reverse")) {
				StringBuffer sb2 = new StringBuffer(str2.substring(a, b + 1));
				str = sb2.reverse().toString();
				str2 = sb1.replace(a, b + 1, str).toString();
			}else if (str3[0].equals("replace")) {
				str2 = sb1.replace(a, b + 1, str3[3]).toString();
			}
		}
	}
}


