
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {	
	    public static void main(String[] args) throws IOException {
	        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
	            int X,Y;
	            String[] t;  
	            while( true ) {
	                String str = reader.readLine();
	                t= str.split( " " );
	               int n = Integer.parseInt(t[0] );
	               int x = Integer.parseInt(t[1] );
	                if(n==0 && x==0 ) {  
	                	break; 
	                	}
	                int count = 0;
	                X = x / 3;
	                int i, j, k;
	                for( i=1; i<X; i++ ) {
	                    Y = ( x-i ) / 2;
	                    for( j=i+1; j<=Y; j++ ) {
	                        k = x - i - j;
	                        if( j < k && k <= n ) {
	                            count++;
	                        }
	                    }
	                }
	                System.out.println( count );    
	            }
	        } 
	    }
	
