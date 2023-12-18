import java.util.Scanner;

public class Main {
	public static Scanner sc;
	
	public static void main(String[] args) {
		//宣言
		int n=0;
		int x[]= new int[300];
		sc = new Scanner(System.in);
		int count=0;
		//入力
		n= sc.nextInt();
		for(int i=0;i<n;i++) {
			x[i]=sc.nextInt();
		}
		//出力
		for(int j=0;j<n;j++) {
			for(int i=n-1;i>=j+1;i--) {
				if(x[i]<x[i-1]) {
					int w = x[i];
					x[i]=x[i-1];
					x[i-1]=w;
					count++;
				}
			}	
		}
		for(int i=0;i<n;i++) {
			System.out.print(x[i]+" ");
		}
		System.out.print("\n");
		System.out.println(count);
	}
}

