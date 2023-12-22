import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int ary[]= new int[n];
		int a,b;
		for (int i=0;i<n;++i){
			ary[i]=sc.nextInt();
		}

		for (int i=0;i<n;++i){
			for (int j=i;j>0;--j){
				a= Math.min(ary[j],ary[j-1]);
				b= Math.max(ary[j], ary[j-1]);
				ary[j-1]=a;
				ary[j]=b;
			}
			for (int k=0;k<n;++k){
				if (k!=n-1)System.out.print(ary[k]+" ");
				else System.out.print(ary[k]);
			}
			System.out.println();
		}
	}
}

