import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Long l = sc.nextLong();
		
		String ret = "";
		
		while(true) {
			l--;
			int c = (int)(l%26);
			char x = (char)('a' + c);
			ret = String.valueOf(x) + ret;
			l /= 26;
			if ( l == 0 ) break;
		}
	
		System.out.println(ret);
	}
	
}
