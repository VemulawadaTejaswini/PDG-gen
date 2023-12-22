import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]) throws IOException{

	double a=0;
	int i=0;
	double j=0;
	double k=0;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();
	String delimiter = " ";
        StringTokenizer stringTokenizer = new StringTokenizer( str, delimiter );
	while(stringTokenizer.hasMoreTokens())
	{
            String current = stringTokenizer.nextToken();
	    if(i==0)a=Double.parseDouble(current);
	    i++;
	}
	j=a*2.0*Math.PI;
	k=a*a*Math.PI;
	System.out.printf("%.6f %.6f\n",k,j);
    }
}