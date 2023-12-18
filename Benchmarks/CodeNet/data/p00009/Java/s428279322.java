import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
	public static void main(String []args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	 int n=Integer.parseInt(br.readLine()),cont=0;
	 

	int sz = 1000000 ;
	 boolean [] criba=new boolean[sz];
	    	criba[0] = criba[1] = true;
	    	int lim= (int)Math.sqrt(sz);
	    	for(int i=2;i<lim;i++)
	        	if(!criba[i])
	            	for(int j=i*i;j<sz;j+=i)
	                	criba[j]=true;

	for(int i = 2; i <= n; i++)
	if(!criba[i])cont++;
	
	


	 System.out.println(cont);
	}
}