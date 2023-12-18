import java.io.*;
import java.util.StringTokenizer;

class lineareq
{
    public static void main( String[] args )
    {
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
	try
	{
	    String line = "";

	    while( (line = br.readLine()) != null && !line.isEmpty() )
		{
		    StringTokenizer st = new StringTokenizer( line );
		    int a, b, c, d, e, f;
		    a = Integer.parseInt(st.nextToken());
		    b = Integer.parseInt(st.nextToken());
		    c = Integer.parseInt(st.nextToken());
		    d = Integer.parseInt(st.nextToken());
		    e = Integer.parseInt(st.nextToken());
		    f = Integer.parseInt(st.nextToken());

		    double det = a*e-b*d, x = (e*c-b*f)/det, y = (-d*c+a*f)/det;

		    if( x == -0.0 )
			x = 0.0;
		    if( y == -0.0 )
			y = 0.0;
	    
		    System.out.printf( "%.3f %.3f\n", x, y );
		}
	} catch( IOException ex )
	{
	    System.out.println("error");
	}
    }
}