import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Hashtable;
//https://vjudge.net/contest/159423#problem/B
public class Main {
	public static void main(String [] argv) throws Exception{
		// lucky: only contain digits 4, 7.
		Scanner in = new Scanner(System.in);
		String a = in.next();
		
		int firstA = 0;
		while(a.charAt(firstA) != 'A') {
			firstA++;
		}
		
		int lastZ = a.length() - 1;
		while(a.charAt(lastZ) != 'Z') {
			lastZ--;
		}
		
		System.out.println(lastZ - firstA + 1);
		// R G B
	} 
	


}
