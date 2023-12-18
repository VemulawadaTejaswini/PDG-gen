import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws InterruptedException, IOException {
		BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
		String data , str;
		char tmp;
		while ( true ){
			data = din.readLine();
			if ( data == null ) break;
			while ( true ) {
				String sarch = data;
				Scanner sc = new Scanner(sarch);
				if ( sc.findInLine("this") != null || sc.findInLine("the") != null || sc.findInLine("that") != null ) {
					break;
				} else {
					str = "";
					for ( int j = 0; j < data.length(); j++ ) {
						if ( data.charAt(j) == '.' ) tmp = '.';
						else if ( data.charAt(j) == ' '  ) tmp = ' ';
						else {
							tmp = (char)(data.charAt(j)+1);
							if ( tmp > 122 ) tmp -= 26;
						}
						str += tmp;
					}
				}
				data = str;
			}
			System.out.println(data);
		}
	}
}