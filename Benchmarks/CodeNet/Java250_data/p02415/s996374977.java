import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	String str=input.readLine();
	for(int i=0;i<str.length();i++)
	    {
		char b=str.charAt(i);
			
		if(('a'<=b) && (b<='z'))
			    System.out.print(Character.toUpperCase(b));
			
		else if(('A'<=b) && (b<='Z'))
			    System.out.print(Character.toLowerCase(b));
		else System.out.print(b);	
			    

		    
		
	    }
	System.out.println();
    }
}