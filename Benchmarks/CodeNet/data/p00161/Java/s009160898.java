import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(true)
	    {
		int n=scan.nextInt();
		if(n==0)break;
		int num[]=new int[n];
		int sum[]=new int[n];
		for(int i=0;i<n;i++)
		    {
			num[i]=scan.nextInt();
			for(int j=0;j<8;j++)
			    {
				if(j%2==0)sum[i]+=60*(scan.nextInt());
				else sum[i]+=scan.nextInt();
			    }
		    }
		
		for(int i=0;i<n;i++)
		    {
			int min=sum[i],x=i;
			for(int j=i;j<n;j++)
			    {
				if(min>sum[j])
				    {
					min=sum[j];
					x=j;
					
				    }
			    }
			int tmp=num[i];
			num[i]=num[x];
			num[x]=tmp;
			int tmp2=sum[i];
			sum[i]=sum[x];
			sum[x]=tmp2;
		    }
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[n-2]);
	    }
    }
}