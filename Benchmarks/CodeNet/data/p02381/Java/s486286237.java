import java.util.Scanner;

public class Main {
	  public static void main(String[]args){
		    Scanner sc = new Scanner(System.in);
		    int ten[];
		    int i=0;
		    int sum;
		    double m=0.0;
		    double x=0.0;
		    double A=0.0;
		    ten = new int[1000];
		    while(true)
            {
		    	sum=0;
		    	m=0.0;
			    x=0.0;
			    A=0.0;
		    	int n=sc.nextInt();
                        if(n==0) break;
		    	for(i=0;i<n;++i)
		    	{
		    		ten[i]=sc.nextInt();
		    		sum=sum+ten[i];
		    	}
		    	m=(double)sum/(double)n;
		    	for(i=0;i<n;++i)
		    	{
		    		x=x+(ten[i]-m)*(ten[i]-m);
		    	}
		    	A=x/(double)n;
		    	double a=Math.sqrt(A);
		    	System.out.println(a);
            }
		    	sc.close();
		    }
}

