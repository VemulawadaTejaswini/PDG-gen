import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		double p2=0;
		double p3=0;
		double value = 0;
		double max=0;
		double Dp1=0;
		double Dp2=0;
		double Dp3=0;
		//sc.useDelimiter("\\s");
		for(int i=0; i<n; i++){
			x[i] = sc.nextInt();
		}	
		for(int i=0; i<n; i++){
			y[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++){
			Dp1 += (double)Math.abs(x[i]-y[i]);
			p2 += Math.pow(x[i]-y[i],2.0);
			p3 += Math.pow(Math.abs(x[i]-y[i]),3.0);
		}
		Dp2 = Math.sqrt(p2);
		Dp3 = Math.cbrt(p3);		
		for(int i=0; i<n; i++){
			value = (double)Math.abs(x[i]-y[i]);
			if(value>max)
				max = value;
		}
		System.out.printf("%.6f\n",Dp1);
		System.out.printf("%.6f\n",Dp2);
		System.out.printf("%.6f\n",Dp3);
		System.out.printf("%.6f\n",max);

	}
}