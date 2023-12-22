import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	String str;
	int a[]=new int[26];
	while((str=input.readLine())!=null)
	    {
		
		for(int j=0;j<26;j++)
		    {	
			
			for(int i=0;i<str.length();i++)
			    {
				
				
				if((char)('A'+j)==str.charAt(i) || (char)('a'+j)==str.charAt(i))a[j]++;
				
			    }
			
		    }

	    }
	for(int j=0;j<26;j++)
	    {
	System.out.println((char)('a'+j)+" :"+" "+a[j]);
	    }
    }
}