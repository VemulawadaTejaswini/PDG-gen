import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]) throws IOException{
	int i=0,a=0,b=0,x=0,tmp=0;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	for(;;)
	{
	    String str = br.readLine();
	    String delimiter = " ";
	    StringTokenizer stringTokenizer = new StringTokenizer( str, delimiter );
	    while(stringTokenizer.hasMoreTokens())
		{
		    String current = stringTokenizer.nextToken();
		    if(i==0)a=Integer.parseInt(current);
		    if(i==1)b=Integer.parseInt(current);
		    i++;
		}
	    if(a==0 && b==0)break;
	    if(a>b){
		a=tmp;
		a=b;
		b=tmp;
	    }
	    System.out.println(a+" "+b);
	}
    }
}