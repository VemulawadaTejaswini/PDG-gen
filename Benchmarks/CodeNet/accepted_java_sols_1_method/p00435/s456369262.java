import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String str = stdIn.next();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++){
			char x = str.charAt(i);
			if( x == 'A' || x == 'B' || x == 'C' ){
				sb.append((char)(x+23));
			} else {
				sb.append((char)(x-3));
			}
		}
		System.out.println(sb.toString());
	}
}