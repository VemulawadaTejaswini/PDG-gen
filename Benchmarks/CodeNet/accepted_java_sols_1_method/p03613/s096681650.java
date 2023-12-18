import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int a[]=new int[N];
		for(int i=0;i<N;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int c[]=new int[100001];
		int i=0;int j=0;int k=0;
		while(j<N) {
			while(j<N&&k==a[j]) {
				i++;j++;
			}
			c[k]=i;
			k++;
			i=0;
		}
		int d[]=new int[99999];
		int x=0;
		for(int l=0;l<99999;l++) {
			d[l]=c[l]+c[l+1]+c[l+2];
			if(x<d[l])x=d[l];
		}

		System.out.println(x);
	}
}
