import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(input.readLine());
	
	String b=input.readLine();
	String  a[]=b.split(" ");
	int c[]=new int[n];
	for(int i=0;i<n;i++)
	    {
		c[i]=Integer.parseInt(a[i]);
	    }
	for(int i=1;i<n;i++)
	    {
	
	
		int j=i;
		while(j>=1 && c[j-1]>c[j])
		    {

			int temp=c[j];
			c[j]=c[j-1];
			c[j-1]=temp;
			
			j--;

		    }
		for(int k=0;k<n;k++)
		    {
			System.out.print(c[k]+" ");
		    }
		System.out.println();
		
	    }
	
    }
}