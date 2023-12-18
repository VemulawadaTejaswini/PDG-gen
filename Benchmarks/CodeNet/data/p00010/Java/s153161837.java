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
		String str_ary[]=str.split(" ");
		Double x[]=new Double[3];
		Double y[]=new Double[3];
		x[0]=Double.parseDouble(str_ary[0]);
		y[0]=Double.parseDouble(str_ary[0]);
		for(int j=1;j<3;j++)
		    {
			x[j]=Double.parseDouble(str_ary[j*2]);
			y[j]=Double.parseDouble(str_ary[j*2+1]);		
		    }
		Double max1=x[0],max2=y[0],min1=x[0],min2=y[0];
		for(int j=0;j<3;j++)
		    {
			if(x[j]>max1)max1=x[j];
			if(y[j]>max2)max2=y[j];
			if(x[j]<min1)min1=x[j];
			if(y[j]<min2)min2=y[j];
		    }	
		
		Double ans1=0d,ans2=0d,ans3=0d;
		
		ans1=(max1+min1)/2;
		
		ans2=(max2+min2)/2;
		ans3=Math.sqrt(Math.pow(max1-ans1,2)+Math.pow(max2-ans2,3));
		if(ans1%1.0000>=5.0000)ans1+=0.001;
		if(ans2%1.0000>=5.0000)ans2+=0.001;
		if(ans3%1.0000>=5.0000)ans3+=0.001;
		System.out.printf("%.3f %.3f %.3f\n",ans1,ans2,ans3);
	    }
	
    }
}