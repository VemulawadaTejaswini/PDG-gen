import java.util.Scanner;

class Main {
 
	public static void main( String args[] ) {
		Scanner scan = new Scanner(System.in);
	    long x, jikan, hun, byou;
	    x = scan.nextLong();
	    jikan = x / 3600;
	    hun = (x - (jikan * 3600)) / 60;
	    byou = x - (jikan * 3600 + hun * 60);
	    
	    
	    System.out.println(jikan + ":" + hun + ":" + byou);
	    
	    //System.out.println(jikan);
	    //System.out.println(hun);
	    //System.out.println(byou);
    } 
 
}