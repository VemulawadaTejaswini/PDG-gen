import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	String str;
	while((str=input.readLine())!=null)
	    {
		String str_ary[]=str.split(",");
		Double a[]=new Double[3];
		for(int i=0;i<3;i++)
		    {
			a[i]=Double.parseDouble(str_ary[i]);
		    }
		if(a[1]/Math.pow(a[2],2)>=25)System.out.println((int)a[0]);
	    }
    }
}