import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String w = s.next();
		int cnt = 0;
		while(s.hasNext()) {
			String str = s.next();
			if(str.equals("END_OF_TEXT")) break;
			if(str.equalsIgnoreCase(w)) cnt++;
		}
		System.out.println(cnt);
	}
}