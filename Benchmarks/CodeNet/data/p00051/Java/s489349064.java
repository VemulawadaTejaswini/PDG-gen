import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(input.readLine());
	for(int i=0;i<n;i++)
	    {
		String str=input.readLine();
		
		int a[]=new int[8];
		int b[]=new int[8];
		for(int j=0;j<8;j++)
		    {
			a[j]=Integer.parseInt(str.charAt(j)+"");
			b[j]=Integer.parseInt(str.charAt(j)+"");
		    }
		for(int j=0;j<8;j++)
		    {
			for(int k=7;j<k;k--)
			    {
				if(a[k-1]>a[k])
				    {
					int tmp=a[k-1];
					a[k-1]=a[k];
					a[k]=tmp;
				    }
				if(b[k-1]<b[k])
				    {
					int tmp=b[k-1];
					b[k-1]=b[k];
					b[k]=tmp;
				    }
			    }

		    }
		
		long sumb=0,suma=0;
		for(int j=0;j<8;j++)
		    {
			sumb+=b[j]*((int)(Math.pow(10,7-j)));
			if(a[j]==0)continue;
			suma+=a[j]*((int)(Math.pow(10,7-j)));
		    }
		System.out.println(sumb-suma);
	    }
    }
}