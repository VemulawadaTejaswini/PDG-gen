import java.io.*;
import java.math.*;
import java.util.*;
public class Main{ //Perform BFS from 2...N then use those values to print

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		String S = input.next();
		if (S.length()<=x) System.out.println(S);
		else System.out.println(S.substring(0,x)+"...");
	}	
}