import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Hashtable;
import java.math.*;
//https://vjudge.net/contest/159423#problem/B
public class Main {
	public static void main(String [] argv) throws Exception{
		// lucky: only contain digits 4, 7.
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		//0 to infinity
		//between time i-1 and time i, can stay, or jump i spots left or right
		int i, total = 0;
		for(i = 1; total < a; i++) {
			total += i;
		}
		System.out.println(i-1);
	} 
	
//	static int jump(int position, int goal, int time) {
//		
//
//	}

}

