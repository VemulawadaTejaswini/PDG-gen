import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String w = sc.nextLine();
		int count = 0;
		Pattern p = Pattern.compile(w, Pattern.CASE_INSENSITIVE);
		
		while(true) {
			String t = sc.next();
			if(t.equals("END_OF_TEXT")) {
				break;
			}
			
			Matcher m = p.matcher(t);
			
			if(m.find()&&m.group().equals(t)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
