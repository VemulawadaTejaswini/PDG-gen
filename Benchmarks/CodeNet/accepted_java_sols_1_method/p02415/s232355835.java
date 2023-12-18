import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		String input = scan.nextLine();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < input.length(); i++){
			char ch = input.charAt(i);
			String c = String.valueOf(ch);
			if(Character.isLowerCase(ch)){
				c = c.toUpperCase();
			} else if(Character.isUpperCase(ch)){
				c = c.toLowerCase();
			}
			sb.append(c);
		}
		String output = sb.toString();
		System.out.println(output);
	}
}