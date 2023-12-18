import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	int hum[]=new int[1000001];
	for(int i=1;i<=1000000;i*=2)
	    {
		for(int j=1;i*j<=1000000;j*=3)
		    {
			for(int k=1;i*j*k<=1000000;k*=5)
			    {
				hum[k*j*i]=1;
			    }
		    }
	    }
	while(true)
	    {
		int m,n;
		m=scan.nextInt();
		if(m==0)break;
		n=scan.nextInt();
		int count=0;
		for(int i=m;i<=n;i++)
		    {
			if(hum[i]==1)count++;
		    }
		System.out.println(count);
	    }
    }
}