//package atcoder;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
	        int a = in.nextInt();
	        int b = in.nextInt();
	        
	        if( a>9 || a<1 || b>9 || b<1){
	        		System.out.println(-1);
	        		return;
	        } 
	        
	        System.out.println(a*b);
	        
	}

}
