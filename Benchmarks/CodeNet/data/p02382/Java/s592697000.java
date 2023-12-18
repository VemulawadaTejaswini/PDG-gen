import java.util.Scanner;

class Main{

	public static void main(String[] args){

		Scanner sc =new Scanner(System.in);

		int n=sc.nextInt();

		int x[]=new int [n];
		int y[]=new int [n];

		for(int i=0;i<n;i++) 
			x[i]=sc.nextInt();

		for(int i=0;i<n;i++) 
			y[i]=sc.nextInt();

		System.out.printf("%.8f\n",dis_1(x,y));
		System.out.printf("%.8f\n",dis_2(x,y));
		System.out.printf("%.8f\n",dis_3(x,y));
		System.out.printf("%.8f\n",dis_o(x,y));

	}

	private static double dis_1(int x[],int y[]) {

		double dis=0;

		for(int i=0;i<x.length;i++)
			dis+=Math.abs(x[i]-y[i]);

		return dis;
	}

	private static double dis_2(int x[],int y[]) {

		double dis=0;

		for(int i=0;i<x.length;i++)
			dis+=(x[i]-y[i])*(x[i]-y[i]);

		return Math.sqrt(dis);
	}

	private static double dis_3(int x[],int y[]) {

		double dis=0;

		for(int i=0;i<x.length;i++)
			dis+=(x[i]-y[i])*(x[i]-y[i])*Math.abs(x[i]-y[i]);

		return Math.cbrt(dis);
	}

	private static double dis_o(int x[],int y[]) {

		double max_dis=0;
		double dis=0;

		for(int i=0;i<x.length;i++) {
			dis=Math.abs(x[i]-y[i]);
			if(dis>max_dis)
				max_dis=dis;
		}

		return max_dis;
	}

}

