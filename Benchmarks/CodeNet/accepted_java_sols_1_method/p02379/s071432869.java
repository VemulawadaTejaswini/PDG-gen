import java.io.*;

class Main {
	public static void main(String[] args) {
		BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
		try {
			String[] nums = kb.readLine().split( " " );
			
			Double x12 = Double.parseDouble( nums[0] ) - Double.parseDouble( nums[2] );
			Double y12 = Double.parseDouble( nums[1] ) - Double.parseDouble( nums[3] );
			
			System.out.println( Math.sqrt( x12*x12 + y12*y12 ) );
			
		} catch( IOException e ) {
			System.err.println( e );
		}
	}
}