import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		int i[] = new int[3];
	    Scanner sc = new Scanner(System.in);
	    String  s1 = sc.next();
	    i[0] = Integer.parseInt(s1);
	    String  s2 = sc.next();
	    i[1] = Integer.parseInt(s2);
	    String  s3 = sc.next();
	    i[2] = Integer.parseInt(s3);
	    int w = 0;
	    for( int j = 0; j < i.length; j++ ){
	        for( int k = 0; k < i.length - 1; k++ ){
	            if( i[k] > i[(k + 1)] ){
	        	    w = i[k];
	        	    i[k] = i[(k + 1)];
	        	    i[(k + 1)] = w;
	            }
    	    }
	    }
	    System.out.println( i[0] + " " + i[1] + " " + i[2] );
	}

}