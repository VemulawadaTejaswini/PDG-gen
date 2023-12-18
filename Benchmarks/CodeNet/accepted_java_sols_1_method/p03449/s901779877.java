import java.util.*;
class Main {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),l;
		int a[][]=new int[2][n],c=0,d=0;
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int s[]=new int[n];
		for (int k=0;k<n;k++)
		{
			for (int i=0;i<n-k;i++) 
			{
				s[k]=s[k]+a[0][i];
			}
			for (int i=n-k-1;i<n;i++)
			{
				s[k]=s[k]+a[1][i];
			}
		}
		Arrays.sort(s);
		System.out.println(s[n-1]);
	}
}
