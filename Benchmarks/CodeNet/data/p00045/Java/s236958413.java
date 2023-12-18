import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	String str;
	int sum=0;
	float n=0,ave,j=1f;

	while((str=input.readLine())!=null)
	    {
		String str_ary[]=str.split(",");
		int a[]=new int[2];
		
		for(int i=0;i<2;i++)
		    {
			a[i]=Integer.parseInt(str_ary[i]);
		    }
		sum+=a[0]*a[1];
		n+=a[1];
		ave=n/j;
		if(ave%1>0.4)ave++;
		
		j++;
	    }
	System.out.println(sum+"\n"+(int)(ave));
    }
}