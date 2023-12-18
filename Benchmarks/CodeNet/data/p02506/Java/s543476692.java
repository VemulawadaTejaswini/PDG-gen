import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String W=scan.next(),T;
		int count = 0;
		Pattern p = Pattern.compile(W,Pattern.CASE_INSENSITIVE);
		
		while(true){
			T = scan.next();
			if(T.equals("END_OF_TEXT")){
				break;
			}
			Matcher m = p.matcher(T);
			if(m.find()){
				count++;
			}
		}
		
		System.out.println(count);
	}
}