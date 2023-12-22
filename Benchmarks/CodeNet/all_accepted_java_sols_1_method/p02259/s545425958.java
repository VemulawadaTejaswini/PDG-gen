import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	int n,k=0;
	 n=Integer.parseInt(input.readLine());
	String str=input.readLine();
	String str_ary[]=str.split(" ");
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	    {
		a[i]=Integer.parseInt(str_ary[i]);
	    }
	for(int i=0;i<n;i++)
	    {
		for(int j=n-1;j>i;j--)
		    {
			if(a[j]<a[j-1])
			    {
				int tmp=a[j];
				a[j]=a[j-1];
				a[j-1]=tmp;
				k++;
			    }
		    }
	    }
	for(int i=0;i<n;i++)
	    {
		System.out.print(a[i]+((i!=n-1)?" ":"\n"));
	    }
	System.out.println(k);
    }
}