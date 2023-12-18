import java.util.*;
class Main
{
	public static void main(String[] args) 
	{  Scanner in=new Scanner(System.in);
		int a[]=new int[10];
				for (int i=0;i<10;i++)
	    a[i]=in.nextInt();
		for(int i=0;i<9;i++)
			for(int j=i+1;j<10;j++)
             if(a[i]<a[j])
		        {
				 int t=a[j];
			     a[j]=a[i];
				 a[i]=t;
		        }
				System.out.println(a[0]);
                System.out.println(a[1]);
                System.out.println(a[2]);
	}