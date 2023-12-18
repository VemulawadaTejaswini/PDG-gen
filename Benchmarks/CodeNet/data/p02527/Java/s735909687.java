import java.util.Scanner;

public class Main {
	static int N=1000005;
	public void print(int[] a,int n){
		System.out.print(a[0]);
		for(int i=1;i<=n;i++)
			System.out.print(" "+a[i]);
		System.out.println();
		/*for(int i=n;i>=0;i--)
			System.out.print(a[i]+" ");*/
	}
	public int getNum(int x,int t){
		for(int i=1;i<t;i++)
			x/=10;
		return x%10;
	}
	public void radixSort(int[] a,int begin,int end,int maxBit){
		int[] cnt=new int[10];
		int[] buc=new int[end-begin+1];
		for(int d=1;d<=maxBit;d++){
			for(int i=0;i<10;i++)
				cnt[i]=0;
			for(int i=begin;i<=end;i++)
				cnt[getNum(a[i],d)]++;
			for(int i=1;i<10;i++)
				cnt[i]+=cnt[i-1];
			for(int i=end;i>=begin;i--)
				buc[--cnt[getNum(a[i],d)]]=a[i];
			for(int i=0;i<=end;i++)
				a[i+begin]=buc[i];
		}
	}
	public int[] sort(int[] a,int n){
		int maxBit=0;
		for(int i=0;i<=n;i++){
			int cnt=0,val=a[i];
			while(val>0){
				cnt++;
				val/=10;
			}
			maxBit=Math.max(maxBit,cnt);
		}
		radixSort(a,0,n,maxBit);
		return a;
	}
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int[] a=new int[N];
		int n=in.nextInt();
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		Main radix =new Main();
		radix.sort(a,n-1);
		radix.print(a,n-1);
	}
}