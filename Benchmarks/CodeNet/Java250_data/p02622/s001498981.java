import java.util.Scanner;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String t = sc.next();
		
		char[] S = s.toCharArray();
		char[] T = t.toCharArray();
		
		int c = 0;
		
 		for(int i = 0; i < s.length(); i++) {
 			if(S[i] != T[i]) c += 1;
		}
		
 		System.out.println(c);
	}
}