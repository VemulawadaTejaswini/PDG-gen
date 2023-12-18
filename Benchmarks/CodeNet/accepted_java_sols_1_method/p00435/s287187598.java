import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	char a[]=input.readLine().toCharArray();
	String str=String.valueOf(a);
	for(int i=0;i<a.length;i++)
	    {
		if(a[i]=='A')a[i]='X';
		else if(a[i]=='B')a[i]='Y';
		else if(a[i]=='C')a[i]='Z';
		else
		    {
			a[i]=(char)(a[i]-3);
			str=String.valueOf(a);
		    }
	    }
	System.out.println(str);
    }
}