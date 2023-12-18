import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(input.readLine());
	
	String str1=input.readLine();
	int m=Integer.parseInt(input.readLine());
	String str2=input.readLine();
	if(n>m)
	    {
		int tmp=n;
		n=m;
		m=tmp;
		String temp=str1;
		str1=str2;
		str2=temp;
	    }
	int b[]=new int[m];
	int a[]=new int[n];
	
	String str_ary1[]=str1.split(" ");
	for(int i=0;i<n;i++)
	    {
		a[i]=Integer.parseInt(str_ary1[i]);
	    }
	
	
	
	String str_ary2[]=str2.split(" ");
	for(int i=0;i<m;i++)
	    {
		b[i]=Integer.parseInt(str_ary2[i]);
	    }
	int x=0;
	for(int i=0;i<n;i++)
	    {
		for(int j=0;j<m;j++)
		    {
			if(a[i]==b[j])
			    {
				x++;
				break;
			    }
		    }
	    }
	System.out.println(x);
    }
}