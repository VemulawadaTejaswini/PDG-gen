import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[])throws IOException{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String num[]=br.readLine().split(" ");
        int a=Integer.parseInt(num[0]);
	int b=Integer.parseInt(num[1]);
	int s=a*b;
	int l=2*a+2*b;
	System.out.print(s+" "+l);
	}
}