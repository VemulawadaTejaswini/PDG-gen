import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	String str1=input.readLine();
	int i=0;
	while(true)
	    {
		String str=input.readLine();
		String str2[]=str.split(" ");
		if(str.equals("END_OF_TEXT"))break;
		for(int j=0;j<str2.length;j++)
		    {
			
			if(str2[j].equalsIgnoreCase(str1))i++;
			
		    }
		
	    }
	System.out.println(i);
    }
}