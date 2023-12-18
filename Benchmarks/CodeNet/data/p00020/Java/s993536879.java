import java.io.*;
class exe0020
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	String str=input.readLine();
	String str_ary[]=str.split(" ");
	for(int i=0;i<str_ary.length;i++)
	    {
		
		System.out.print(str_ary[i].toUpperCase()+((i==str_ary.length-1)?("\n"):(" ")));
	    }
    }
}