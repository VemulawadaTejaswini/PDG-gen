import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),K=sc.nextInt();
		int[] x=new int[N];
		int max=0;
		for(int i=0;i<N;i++)
		{
			x[i]=sc.nextInt();
			max=((int)Math.abs(x[i])<=(int)Math.abs(x[i]-K))?max+2*(int)Math.abs(x[i]):max+2*(int)Math.abs(x[i]-K);
		}
		System.out.println(max);
	}
}
