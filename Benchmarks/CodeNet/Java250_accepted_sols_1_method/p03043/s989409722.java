//package atcoder;
import java.util.*;
import java.lang.Math.*;
class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			int j=i;
			int x=0;
			while(j<k)
			{
				j=j*2;
				x++;
			}
			sum=sum +(double)((1/(double)n)*(Math.pow((1/(double)2),x)));
		}
		System.out.printf("%.12f",sum);
	}

}
