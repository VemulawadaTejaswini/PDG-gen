class Main
{
	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader br = new java.io.BufferedReader( new java.io.InputStreamReader( System.in ) );
		
		int x = Integer.parseInt( br.readLine() );
		System.out.println( (int) Math.pow( x, 3 ) );
	}
}