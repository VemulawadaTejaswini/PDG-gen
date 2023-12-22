
import java.util.*;
import java.util.regex.Pattern;

public class Main {
	 
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		String str=cin.nextLine();
		List<Character> res=new ArrayList<>();
		Pattern B=Pattern.compile("^[A-Z]+$");
		Pattern S=Pattern.compile("^[a-z]+$");
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c>=65 && c<=90) {
				res.add((char)(c+32));
			}
			else if(c>=97 && c<=122) {
				res.add((char)(c-32));
			}
			else res.add(c);
		}
		
		for(int i=0;i<res.size();i++)System.out.print(res.get(i));
		System.out.println();
	}
	
}
