import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		int n=-1;
		Scanner sc=new Scanner(System.in);
		while(1>0){
			double m=0,a=0;
			double[] s;
			n=sc.nextInt();
			if(n==0)break;
			s=new double[n];
			for(int i=0;i<n;i++){
				s[i]=sc.nextInt();
				m+=s[i];
			}
			m/=(double)n;
			for(int i=0;i<n;i++)a+=Math.pow(s[i]-m,2);
			a/=(double)n;
			a=Math.sqrt(a);
			System.out.printf("%.9f\n",a);
		}
	}
}