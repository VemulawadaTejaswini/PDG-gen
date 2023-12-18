import java.io.*;


public class Main{
    public static void main(String[] args)throws IOException{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	String nst = br.readLine();
	int n = Integer.parseInt(nst);
	long fact =1;
	for(int i=1;i<=n;i++)
	    fact*=i;
	System.out.println(fact);
    }
}
	    