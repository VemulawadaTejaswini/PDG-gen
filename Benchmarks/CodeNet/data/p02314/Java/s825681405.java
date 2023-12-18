import java.util.*;

public class Main {
	
	static Scanner sc;
	static int T,N,M,arr[],ans[][];
	
	public static int min(int a, int b)	{
		if(a<=b)
			return a;
		else
			return b;
	}
	
	public static int minCount(int a[],int x, int s)	{
		int c,d;
		for(int i=0;i<x;i++)
			ans[0][i] = 0;
		for(int i=1;i<=s;i++)	{
			for(int j=0;j<x;j++)	{
				if(i-a[j]>=0 && ans[i-a[j]][j]!=-1)
					c = 1 + ans[i-a[j]][j];
				else
					c = -1;
				if(j-1>=0 && ans[i][j-1]!=-1)
					d = ans[i][j-1];
				else
					d = -1;
				if(c!=-1 && d!=-1)
					ans[i][j] = min(c,d);
				else if(c==-1 && d!=-1)
					ans[i][j] = d;
				else if(c!=-1 && d==-1)
					ans[i][j] = c;
				else
					ans[i][j] = -1;
			}
		}
		return ans[s][x-1];
	}

	public static void main(String[] args) {
		int answer;
		sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int l=0;l<T;l++)	{
			N = sc.nextInt();
			M = sc.nextInt();
			arr = new int[M];
			ans = new int[N+1][M];
			for(int i=0;i<M;i++)
				arr[i] = sc.nextInt();
			answer = minCount(arr, M, N);
			if(answer==-1)
				System.out.println("No solution");
			else
				System.out.println(answer);
		}
	}

}