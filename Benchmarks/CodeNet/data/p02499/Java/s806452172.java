import java.util.Scanner;
import java.util.NoSuchElementException;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str;
		int[] count = new int[26];
		while( true ){
			try{
				str = scan.nextLine();
				for( int i = 0; i < str.length(); i++ ){
					char c = str.charAt(i);
					if( (int)'A' <= (int)c && (int)c <= 'Z' ){
						c = (char)((int)c - 'A');
					}else if( (int)'a' <= (int)c && (int)c <= 'z' ){
						c = (char)((int)c - 'a');
					}else{
						continue;
					}
					count[(int)c]++;
				}
			}catch( NoSuchElementException e ){
				System.out.println(e);
				break;
			}
		}
		for( int i = 0; i < 26; i++ ){
			System.out.printf("%c : %d\n", (char)(i + 'a'), count[i]);
		}
		return;
	}
}