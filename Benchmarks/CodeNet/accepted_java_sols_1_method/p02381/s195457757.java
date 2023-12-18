import java.util.Scanner;

class Main{
 
	public static void main(String[] args) {

		int n,i;
		double ave,std;

		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			int sum=0;
			double var=0;
			
			n = scan.nextInt();
			
			if(n==0) break;
			
			int a[] = new int[n];
			
			for(i=0; i<n; i++)
			{
				a[i] = scan.nextInt();
				sum += a[i];
			}
			
			ave = (double)sum/n;
			
			for(i=0; i<n; i++)
			{
				var += ( (a[i] - ave)*(a[i] - ave) );
			}
			
			std = Math.sqrt(var/n);
			
			System.out.printf("%.5f\n",std);
		}
		
		scan.close();
	}
}