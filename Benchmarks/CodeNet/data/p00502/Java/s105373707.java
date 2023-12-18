import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int D=sc.nextInt(), N=sc.nextInt();
		
		int[] T=new int[D];
		int[] A=new int[N];
		int[] B=new int[N];
		int[] C=new int[N];
		int[] curr=new int[N];
		int[] next=new int[N];
		
		for(int i=0; i<D; i++)
			T[i]=sc.nextInt();
		
		for(int i=0; i<N; i++)
		{
			A[i]=sc.nextInt();
			B[i]=sc.nextInt();
			C[i]=sc.nextInt();
		}
		
		for(int i=0; i<D-1; i++)
		{
			for(int j=0; j<N; j++)
			for(int k=0; k<N; k++)
			{
				if( A[j]<=T[i]   && T[i]  <=B[j] &&
					A[k]<=T[i+1] && T[i+1]<=B[k]  )
				{
					int currNext=0;
					currNext += curr[j];
					currNext += Math.abs(C[j]-C[k]);
					if(currNext > next[k])
						next[k] = currNext;
				}
			}
			for(int j=0; j<N; j++)
			{
				curr[j] = next[j];
				next[j] = 0;
			}
		}
		
		int max=curr[0];
		for(int i=1; i<N; i++)
			max = Math.max(max, curr[i]);
		System.out.println(max);
	}
}