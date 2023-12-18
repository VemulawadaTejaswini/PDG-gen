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
	
		for(int i=0;i<n;i++)
		    {
			int pm,pe,pj;
			pm=scan.nextInt();
			pe=scan.nextInt();
			pj=scan.nextInt();
			if(pm==100 || pe==100 || pj==100)System.out.println("A");
			else if((pm+pe)/2>=90)System.out.println("A");
			else if((pm+pe+pj)/3>=80)System.out.println("A");
			else if((pm+pe+pj)/3>=70)System.out.println("B");
else if((pm+pe+pj)/3>=50 && pm>=80 || pe>=80)System.out.println("B");
else System.out.println("C");
		    }
	    }
	
    }
}