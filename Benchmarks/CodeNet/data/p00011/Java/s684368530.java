import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	int w=Integer.parseInt(input.readLine());
	int a[]=new int[w];
	for(int i=0;i<w;i++)
	    {
		a[i]=i+1;
	    }
	int n=Integer.parseInt(input.readLine());
	for(int i=0;i<n;i++)
	    {
		String str=input.readLine();
		String str_ary[]=str.split(",");
		int b[]=new int [2];
		
			b[0]=Integer.parseInt(str_ary[0])-1;
			b[1]=Integer.parseInt(str_ary[1])-1;
		int tmp=a[b[0]];
		a[b[0]]=a[b[1]];
		a[b[1]]=tmp;
	    }
for(int i=0;i<w;i++)
	    {
		System.out.println(a[i]);
	    }
    }
}