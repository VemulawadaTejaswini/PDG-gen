import java.io.*;
import java.util.regex.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str;
		String op;
		int a, b, result = 0;
		
		LOOP : do {	
			str = br.readLine().split("\\s+");
			if (str.length == 3 && chkStrToInt(str[0]) && chkStrToInt(str[2])) {

				a	= Integer.parseInt(str[0]);
				b	= Integer.parseInt(str[2]);
				op	= str[1];
				
				switch (op) {
				case "+":	result = a + b; break;
				case "-":	result = a - b; break;
				case "*":	result = a * b; break;
				case "/":	result = a / b; break;
				case "?":	break LOOP;
				default :	continue LOOP;
				}
				System.out.println(result);
			}
		} while (true);
	}
	
	public static boolean chkStrToInt(String str) {
		Pattern p = Pattern.compile("^[0-9]+$");
		Matcher m = p.matcher(str);
		
		return m.find();
	}
}