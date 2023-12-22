import java.util.Scanner;

public class Main {
	public static Scanner sc;
	
	public static void main(String[] args) {
		//宣言
		int N=0;
		int A[]= new int[300];
		sc = new Scanner(System.in);
		int count=0;
		//入力
		N= sc.nextInt();
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		//出力
		for(int j=0;j<N;j++) {
			for(int i=N-1;i>=j+1;i--) {
				if(A[i]<A[i-1]) {
					int w = A[i];
					A[i]=A[i-1];
					A[i-1]=w;
					count++;
				}
			}	
		}
		for(int i=0;i<N;i++) {
			if(i>=0 &&i<N-1) {
				System.out.print(A[i]+" ");
			}else if(i==N-1) {
				System.out.println(A[i]);
			}
		}
		System.out.println(count);
	}
}
