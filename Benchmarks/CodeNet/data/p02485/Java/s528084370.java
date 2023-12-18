import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str;
		while( true ){
			str = scan.next();
			int val = 0;
			for( int i = 0; i < str.length(); i++ ){
				val += ConvertCharToInt(str.charAt(i));
			}
			if( val != 0 ){
				System.out.println(val);
			}else{
				break;
			}
		}
		return;
	}
	
	public static int ConvertCharToInt(char data){
		int val = 0;
		if( '0' <= data && data <= '9' ){
			val = (int)data - '0';
		}
		return val;
	}
}