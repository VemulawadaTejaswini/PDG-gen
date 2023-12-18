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
		String str_ary[]=new String[8];
		int a[]=new int[8];
		int b[]=new int[8];
		for(int j=0;j<8;j++)
		    {
			a[j]=Integer.parseInt(str.charAt(j)+"");
			b[j]=Integer.parseInt(str.charAt(j)+"");
		    }
		
		for(int j=0;j<8;j++)
		    {
			
			
			int max=a[j],x=j;
			for(int k=j;k<8;k++)
			    {
				if(max<a[k])
				    {
					max=a[k];
					x=k;
					
				    }
			    }
			
			int tmp=a[j];
			a[j]=max;
			a[x]=tmp;
		    }
		
		for(int j=0;j<8;j++)
		    {
			int mini=b[j],x=j;
			for(int k=j;k<8;k++)
			    {
				if(mini>b[k])
				    {
					mini=b[k];
					x=k;
					
				    }
			    }
			
			int tmp=b[j];
			b[j]=mini;
			b[x]=tmp;
			
		    }
		String stra="";
		for(int l=0;l<8;l++)
		    {
			stra+=Integer.toString(a[l]);
		    }
		int max=Integer.parseInt(stra);
		String strb="";
		for(int l=0;l<8;l++)
		    {
			if(b[l]==0)continue;
			strb+=Integer.toString(b[l]);
		    }
		int mini=Integer.parseInt(strb);
		
		System.out.println(max-mini);
	    }
    }
}