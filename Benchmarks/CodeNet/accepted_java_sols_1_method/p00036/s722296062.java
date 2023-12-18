import java.io.*;
import java.util.*;

public class Main {
	public static void main ( String[] args ) {
		Scanner sc = new Scanner(System.in);
		String[] field;
		while ( sc.hasNext() ) {
			String result = "";
			field = new String[8];
			for ( int i = 0; i < 8; i++ )
				field[i] = sc.nextLine();
			for ( int i = 0; i < 8; i++ ) {
				int a = field[i].indexOf("1");
				if ( a != -1 ) {
					int b = field[i].lastIndexOf("1");
					if ( b - a == 3 ) result = "C";
					else if ( b - a == 1 && i < 7 ) {
						if ( field[i+1].charAt(a) == '1' && field[i+1].charAt(b) == '1' )
							result = "A";
						else if ( a < 6 && field[i+1].charAt(a+1) == '1' && field[i+1].charAt(b+1) == '1' )
							result = "E";
						else if ( a > 0 && field[i+1].charAt(a-1) == '1' && field[i+1].charAt(b-1) == '1' )
							result = "G";
					} else if ( b - a == 0 ) {
						if ( i < 5 && field[i+1].charAt(a) == '1' && field[i+2].charAt(a) == '1' && field[i+3].charAt(a) == '1' )
							result = "B";
						else if ( i < 6 && a > 0 && field[i+1].charAt(a) == '1' && field[i+1].charAt(a-1) == '1' && field[i+2].charAt(a-1) == '1' )
							result = "D";
						else if ( i < 6 && a < 7 && field[i+1].charAt(a) == '1' && field[i+1].charAt(a+1) == '1' && field[i+2].charAt(a+1) == '1' )
							result = "F";
					}
				}
			}
			System.out.println(result);
			if ( sc.hasNext() ) sc.nextLine();
		}
	}
}