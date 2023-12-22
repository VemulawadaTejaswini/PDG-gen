import java.util.Scanner;
import java.util.Date;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a,b,c,m,n;
	while(sc.hasNext()){
	    a=sc.nextInt();
	    b=sc.nextInt();
	    m=a;n=b;
	    if(m<n)
		{
		    c=n;
		    n=m;
		    m=c;
		}
	    while(true)
		{
		    if(n==0)break;
		    c=n;
		    n=m%n;
		    m=c;
		}
	   System.out.printf("%d %d\n",m,a/m*b);
	}
    }
}