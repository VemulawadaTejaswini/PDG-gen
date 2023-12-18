import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException
	{
        int a=0,b=0;
        int m=0, r=0;
        String s;
        try 
        {
                InputStreamReader isr=new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(isr);
                s=br.readLine();
                StringTokenizer st=new StringTokenizer(s," ");

                a=Integer.parseInt(st.nextToken());
                b=Integer.parseInt(st.nextToken());
                m = a * b;
                r = 2*(a + b);
        }
        catch(Exception e) 
        {
        	System.out.println(e);
        }
        System.out.println(m + " " + r);
	}
}