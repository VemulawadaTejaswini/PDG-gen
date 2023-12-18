import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	String str1=input.readLine();
	int n=Integer.parseInt(str1);
	int a=0,b=0;
	for(int i=0;i<n;i++)
	    {
		String str3=input.readLine();
	String str2[]=str3.split(" ");
	if(str2[0].compareTo(str2[1])>0)a+=3;
	else if(str2[0].compareTo(str2[1])<0)b+=3;
	else if(str2[0].compareTo(str2[1])==0)
	    {
		a++;
		b++;
	    }

	    }
	System.out.println(a+" "+b);
    }
}