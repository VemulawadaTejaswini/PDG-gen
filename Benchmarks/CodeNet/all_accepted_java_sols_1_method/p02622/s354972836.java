import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String s= br.readLine();
	    String t=br.readLine();
	    int count=0;
	    for(int i=0;i<s.length();i++)
	    {
	        if(s.charAt(i)==t.charAt(i)) continue;
	        else count++;
	    }
	   System.out.println(count);

	   }
}
