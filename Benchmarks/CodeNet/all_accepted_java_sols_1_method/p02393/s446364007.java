import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]) throws IOException{

	int a=0;
	int b=0;
	int c=0;
	int i=0;
	int tmp=0;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();
	String delimiter = " ";
        StringTokenizer stringTokenizer = new StringTokenizer( str, delimiter );
	while(stringTokenizer.hasMoreTokens())
	{
            String current = stringTokenizer.nextToken();
	    if(i==0)a=Integer.parseInt(current);
	    if(i==1)b=Integer.parseInt(current);
	    if(i==2)c=Integer.parseInt(current);
	    i++;
	}
	if(a>c){
	    tmp=a;
	    a=c;
	    c=tmp;
	}
	if(a>b){
	    tmp=a;
	    a=b;
	    b=tmp;
	}
	if(b>c){
	    tmp=b;
	    b=c;
	    c=tmp;
	}
        System.out.println(a+" "+b+" "+c);
    }
}