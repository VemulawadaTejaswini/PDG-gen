import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	String str=input.readLine();
	String str_ary[]=str.split(" ");
	int a[]=new int[5];
	for(int i=0;i<5;i++)
	    {
		a[i]=Integer.parseInt(str_ary[i]);
	    }
	for(int i=0;i<5;i++)
	    {
		int max=i;
		for(int j=i;j<5;j++)
		    {
			if(a[j]>a[max])
			    {
				max=j;

			    }
			
		    }
		
		int tmp=a[i];
		a[i]=a[max];
		a[max]=tmp;
		
	    
	
	    }
	for(int k=0;k<5;k++)System.out.print(a[k]+((k==4)?"\n":" "));
    }
}