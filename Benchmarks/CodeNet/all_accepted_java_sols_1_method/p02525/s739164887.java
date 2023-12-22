import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int num[]=new int[1000];
		int sum=0;
		double ave;
		double bun;
		double a;
		double sum1=0;
		double hensa;

		while(true){
			int n=s.nextInt();

			if(n==0){
				break;
			}

			for(int i=0;i<n;i++){
				num[i]=s.nextInt();
				sum+=num[i];
			}
			ave=(double)sum/n;

			for(int i=0;i<n;i++){
				a=(num[i]-ave)*(num[i]-ave);
				sum1+=a;
			}
			bun=sum1/n;
			hensa = Math.sqrt(bun);

			System.out.printf("%.8f\n",hensa);

			sum=0;
			sum1=0;
		}

	}
}