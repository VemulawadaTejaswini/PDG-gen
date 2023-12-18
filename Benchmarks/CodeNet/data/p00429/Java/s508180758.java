import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	private void run(){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (n != 0) {
			String str = scan.next();
			for (int p = 0; p < n; p++) {
				String s = null;
				StringBuffer buf = new StringBuffer();
				int strLeng = str.length();
				for (int i = 0; i < strLeng; i++) {
					char chara = str.charAt(i);
					int number = 1;
					for (int j = i; j + 1 < str.length() && chara == str.charAt(j+1); j++) {
						number++;
					}
					buf.append(number);
					buf.append(chara);
					s = buf.toString();
					i += number-1;
				}
				//System.out.println(s);
				str = s;
			}
			System.out.println(str);
			n = scan.nextInt();
		}
	}
}