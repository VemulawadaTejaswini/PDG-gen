import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		  Scanner in = new Scanner(System.in);
		  String s = in.next();
		  int count = 0;

		if ( s.charAt(0) == '1') {
			count++;
		}
		if( s.charAt(1) == '1') {
			count++;
		}
		if( s.charAt(2) == '1') {
			count++;
		}
		System.out.println(count);
		in.close();
	}
}
