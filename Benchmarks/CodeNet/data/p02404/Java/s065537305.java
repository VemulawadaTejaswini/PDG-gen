import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]) throws IOException{

	int a=0;
	int b=0;
	int i=0;

	for(;;){
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = br.readLine();
	    if(str.equals("0 0"))break;
	    String delimiter = " ";
	    StringTokenizer stringTokenizer = new StringTokenizer( str, delimiter );
	    while(stringTokenizer.hasMoreTokens())
		{
		    String current = stringTokenizer.nextToken();
		    if(i==0)a=Integer.parseInt(current);
		    if(i==1)b=Integer.parseInt(current);
		    i++;
		}
	    i=0;
	    for(int j=0;j<a;j++){
		for(int k=0;k<b;k++){
		    if(j>0 && j<a-1 && k>0 && k<b-1){
			System.out.print(".");
		    }
		    else System.out.print("#");
		}
		System.out.println();
	    }
	}
    }
}