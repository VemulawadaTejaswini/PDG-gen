import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        try {
			
			char[] field = kb.readLine().toCharArray();
			int len = field.length;
			int[] areas = new int[10000];
			int cnt, found, total;
			
			cnt = total = found = 0;
            for( int i=0; i<len; i++ ) {
            	found = findPool( field, i, len );
            	if( 0 < found ) {
            		areas[cnt] = getArea( field, i, found );
            		total += areas [cnt++];
            		i = found;
            		found = 0;
            	}
            }
            
            StringBuilder output = new  StringBuilder( );
            output.append( total ).append( "\n" );
            output.append( cnt ).append( " " );
           	for( int i=0; i<cnt; i++ ) {
           		output.append( areas[i] ).append( " " );
         	}
         	output.deleteCharAt( output.lastIndexOf( " " ) );
         	System.out.println( output );

	    } catch( IOException e ) {
	        System.err.println( e );
	    }
	}
	public static int getArea( char[] field, int start, int end )
	{
		int i, area, cnt, s, t;
		area = cnt = s = t = 0;
		for( i=start; i<=end; i++ ) {
            if( '\\'== field[i] ) {
            	cnt++;
            	t++;
            	area += cnt;
            } else if( 0 < cnt && '/' == field[i] ) {
            	area += cnt;
            	cnt--;
            } else if( '_' == field[i]  ) {
            	s += cnt;
            }
		}
		area = ( area - t + s );
		
		return area;
	}
	public static int findPool( char[] field, int start, int end )
	{
		int cnt, i;
		cnt = 0;
		for( i=start; i<end; i++ ) {
            if( '\\'== field[i] ) {
            	cnt++;
            } else if( 0 < cnt && '/' == field[i] ) {
            	cnt--;
            	if( 0 == cnt ) { break; }
            }
		}
		if( end == i ) { i = 0; }
		return i;
	}
}