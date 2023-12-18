import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	double dept=100000;
	int n=Integer.parseInt(input.readLine());
	for(int i=0;i<n;i++)
	    {
		dept=dept*1.05;				
		
	    }
	if((int)(dept/10000)>0)
	    {
	dept=(int)(dept/10000)*10000+10000;
	    }
	dept=(int)(dept/10000)*10000;
	System.out.println((int)dept);
    }
}