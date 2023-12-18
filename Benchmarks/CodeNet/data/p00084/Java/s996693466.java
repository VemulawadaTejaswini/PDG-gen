import java.util.*;

public class Main {
	static boolean isDelimiter(char c){
		return c == ' ' || c == ',' || c == '.';
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String results = "" , word = "" , str = sc.nextLine();
		for (int i = 0; i < str.length(); i++ ) {
			if ( !isDelimiter(str.charAt(i)) )
				word += str.charAt(i);
			else{
				if ( 3 <= word.length() && word.length() <= 6 )
					results += word+" ";
				word = "";
			}
		}
		System.out.println(results.substring(0,results.length()-1));
	}
}