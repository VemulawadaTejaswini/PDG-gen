import java.util.*;

class Main {
	public static void main(String[] args){
		final Scanner sc = new Scanner(System.in);		
		final String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < str.length(); i++){
			final char c = str.charAt(i);
			if('a' <= c && c <= 'z'){
				sb.append(String.valueOf(c).toUpperCase());
			} else if('A' <= c && c <= 'Z'){
				sb.append(String.valueOf(c).toLowerCase());
			} else {
				sb.append(String.valueOf(c));
			}
			
		}
		System.out.println(sb.toString());
	}
}