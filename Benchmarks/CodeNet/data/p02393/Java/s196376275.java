import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		
	    Scanner sc = new Scanner(System.in);
	    String  s1 = sc.next();
	    int a = Integer.parseInt(s1);
	    String  s2 = sc.next();
	    int b = Integer.parseInt(s2);
	    String  s3 = sc.next();
	    int c = Integer.parseInt(s3);
	    if( a < b && b < c){
	        System.out.println( a + " " + b + " " + c );
    	}
	    else if( b < c && c < a){
	    	System.out.println( b + " " + c + " " + a );
	    }
	    else if( c < a && a < b){
	    	System.out.println( c + " " + a + " " + b );
	    }
	    else if( a < c && c < b){
	    	System.out.println( a + " " + c + " " + b );
	    }
	    else if( b < a && a < c){
	    	System.out.println( b + " " + a + " " + c );
	    }
	    else{
	    	System.out.println( c + " " + b + " " + a );
	    }
	}

}