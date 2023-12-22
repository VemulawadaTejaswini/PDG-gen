import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	
	String a;
	while(true)
	    {
		a=input.readLine();
		if(a.equals("0"))break;			
		int n=Integer.parseInt(a);
		String c=input.readLine();
		String b[]=c.split(" ");
		double d=0,sum=0;
		double e[]=new double[n];
		for(int j=0;j<n;j++)
		    {			
			e[j]=Double.parseDouble(b[j]);
			sum+=e[j];
		    }
		
			double m=sum/n;
			
			for(int i=0;i<n;i++)
			    {
				d+=(Math.pow((e[i]-m),2)/n);
			    } 
			
		System.out.println(Math.sqrt(d));
	    }
    }
}


			    