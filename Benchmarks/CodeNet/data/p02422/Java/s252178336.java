import java.io.*;

class Main {
	public static void main(String[] args) {
		BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
		try {
			String str = kb.readLine();
			int q = Integer.parseInt( kb.readLine() );
			
			StringBuilder output = new StringBuilder( str );
			StringBuilder tmp = new	StringBuilder( 1000+1 );
			int start, end;
			while( 0 < q-- ) {
				String[] instruction = kb.readLine().split( " " );
				start = Integer.parseInt( instruction[1] );
				end = Integer.parseInt( instruction[2] );
				if( instruction[0].equals( "print" ) ) {
		        	System.out.println( str.substring( start, end+1 ) );
				} else if( instruction[0].equals( "reverse" ) ) {
					tmp.setLength( 0 );
					tmp.append( output.substring( start, end+1 ) );
					tmp.reverse();
					output.replace( start, end+1, tmp.toString()  );
					str = output.toString();
				} else if( instruction[0].equals( "replace" ) ) {
					output.replace( start, end+1, instruction[3]  );
					str = output.toString();
				}
			}
				        
		} catch( IOException e ) {
			System.err.println( e );
		}
	}
}