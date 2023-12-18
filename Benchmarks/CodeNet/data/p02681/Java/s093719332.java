import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		String t = scan.next();
		String x = t.substring(0,t.length()-1);
		
		if(s.equals(x)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}	
	
	
	//最小公約数
	/*
	static int gcd (int a, int b) {
		int temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}
	*/
	
	//入れ替え
	/*
	static int swap (int a, int b) {
		int swap_arr[] = new int[2];
		
		swap[0] = b;
		swap[1] = a;
		
		return swap_arr;
	}
	*/
	
}

