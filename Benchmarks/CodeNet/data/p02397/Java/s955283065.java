import java.util.Scanner;
import java.io.*;


class Main {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    while( true ){
	    	String s1 = sc.next();
	    	int x = Integer.parseInt(s1);
	    	String s2 = sc.next();
	    	int y = Integer.parseInt(s2);
	    	if( x == 0 && y == 0){
	    		break;
	    	}
	    	if( x < y ){
	    	    System.out.println( x + " " + y );
	    	}
	    	else{
	    		System.out.println( y + " " + x );
	    	}
	    }
	}
}