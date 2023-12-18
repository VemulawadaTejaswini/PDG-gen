import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]) throws IOException{

	int a=0;
	int b=0;
	int i=0;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	for(;;){
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
	    i=0;
	    for(int j=0;j<a;j++){
		for(int k=0;k<b;k++){
		    System.out.print("#");
		}
		System.out.println();
	    }
	}
    }
}