import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	String str=input.readLine();
	char a[]=str.toCharArray();
	for(int i=0;i<a.length-4;i++)
	    {
		if(a[i]=='a' && a[i+1]=='p' && a[i+2]=='p' && a[i+3]=='l' && a[i+4]=='e')
		    {
			a[i]='p';
			a[i+1]='e';
			a[i+2]='a';
			a[i+3]='c';
			a[i+4]='h';
		    }
		else if(a[i]=='p' && a[i+1]=='e' && a[i+2]=='a' && a[i+3]=='c' && a[i+4]=='h')
		    {
			a[i]='a';
			a[i+1]='p';
			a[i+2]='p';
			a[i+3]='l';
			a[i+4]='e';
		    }
		
	    }
	    for(int i=0;i<a.length;i++)
		    {
			System.out.print(a[i]);
		    }
	    System.out.println();
    }
}