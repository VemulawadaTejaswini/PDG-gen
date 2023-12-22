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
		if((int)(dept%1000)>0)
	    {
		dept=(int)(dept+1000-dept%1000);
	    }
	    }
	
	dept=(int)(dept-dept%1000);
	System.out.println((int)dept);
    }
}