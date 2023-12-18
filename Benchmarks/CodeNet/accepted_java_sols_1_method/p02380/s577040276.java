import java.io.*;

class Main {
	public static void main(String[] args) {
		BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
		try {
			String[] nums = kb.readLine().split( " " );
			
			Double a = Double.parseDouble( nums[0] );
			Double b = Double.parseDouble( nums[1] );
			Double C = Double.parseDouble( nums[2] );
			Double radianC = Math.toRadians( C );
			
			Double h = Math.sin( radianC ) * b;
			Double S = ( a*h )/2;
			
			Double a2 = Math.cos( radianC ) * b;
			a2 -= a;
			Double L = Math.sqrt( ( Math.pow( a2, 2 ) + Math.pow( h, 2 ) ) );
			L = L+a+b;
			
			System.out.print( S+"\n"+L+"\n"+h+"\n" );
			
		} catch( IOException e ) {
			System.err.println( e );
		}
	}
}