import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		
	    Scanner sc = new Scanner(System.in);
	    String  s1 = sc.next();
	    int a = Integer.parseInt(s1);
	    String  s2 = sc.next();
	    int b = Integer.parseInt(s2);
	    if( a < b ){
	        System.out.println( "a < b" );
    	}
	    else if( a > b ){
	    	System.out.println( "a > b" );
	    }
	    else{
	    	System.out.println( "a == b" );
	    }
	}

}