import java.util.Scanner;
        
        public class Main {
        	public static void main(String[] args) {
        		Scanner in = new Scanner(System.in);
        		String str = in.next();
        		if( Character.isUpperCase( str.charAt( 0 ) ) ) {
        		    System.out.println( "A" );
        		}
        		else {
        		    System.out.println( "a" );
        		}
        	}
        }