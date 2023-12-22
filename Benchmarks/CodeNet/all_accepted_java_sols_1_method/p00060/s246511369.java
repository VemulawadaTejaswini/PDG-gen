import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	String str;
	while((str=input.readLine())!=null)
	    {
		String str_ary[]=str.split(" ");
		int a[]=new int[3];
		for(int i=0;i<3;i++)
		    {
			a[i]=Integer.parseInt(str_ary[i]);
		    }
		int m=0;
		for(int x=0;x<11;x++)
		    {
			if(a[0]+a[1]+x>20 && x!=a[0] && x!=a[1] && x!=a[2])
			    {
				
				m++;
			    }
		    }
		if(m>3)System.out.println("NO");
		else System.out.println("YES");
	    }
    }
}