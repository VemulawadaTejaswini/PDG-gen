//package round660;

import java.util.*;
import java.io.PrintWriter;
class Solution{
	
	static PrintWriter out;
	static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc=new Scanner(System.in);
		out=new PrintWriter(System.out);
		
		
		int n=sc.nextInt();
		if(n>=30) {
			out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		sc.close();
		out.close();
		
	}
}
