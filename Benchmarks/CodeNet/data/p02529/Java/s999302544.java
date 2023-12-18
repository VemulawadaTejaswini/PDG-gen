import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] d;
		d=new int[501];
		for(int i=0;i<=500;i++)d[i]=0;
		for(int i=0;i<n;i++){
			int s=sc.nextInt();
			d[s]=1;
		}
		int q=sc.nextInt();
		int cnt=0;
		for(int i=0;i<q;i++){
			int t=sc.nextInt();
			cnt+=d[t];
		}

		System.out.printf("%d\n",cnt);
	}
}