import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int r[]=new int[n];
		int a,b;
		int counter=0;

		for (int i=0;i<n;++i){
			r[i]=sc.nextInt();
		}

		for (int i=0;i<n;++i){
			for (int j=n-1;j>i;--j){
				if(r[j]<r[j-1]){
					a=r[j];
					b=r[j-1];
					r[j]=b;
					r[j-1]=a;
					++counter;
				}
			}
		}

		for (int i=0;i<n;++i){
			System.out.print(r[i]);
			if(i != n-1)System.out.print(" ");
		}
		System.out.println();
		System.out.println(counter);
	}

}
