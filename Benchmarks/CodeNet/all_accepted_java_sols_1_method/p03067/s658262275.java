

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in) ;
		int one = in.nextInt() ; 
		int two = in.nextInt() ;
		int three = in.nextInt() ;
		
		int temp ;
		if(one>two) {
			temp = one ;
			one = two ;
			two = temp ;
		}
		
		if(three>one && three<two)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
