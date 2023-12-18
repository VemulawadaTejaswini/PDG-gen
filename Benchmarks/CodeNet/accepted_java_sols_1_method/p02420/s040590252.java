import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	
	
	while(true)
	    {
		String str=input.readLine();
		if(str.equals("-"))break;
		int n=Integer.parseInt(input.readLine());
		for(int i=0;i<n;i++)
		    {
			int h=Integer.parseInt(input.readLine());
			 str=str.substring(h,str.length())+str.substring(0,h);

		    }
			System.out.println(str);
	    }
    }
}