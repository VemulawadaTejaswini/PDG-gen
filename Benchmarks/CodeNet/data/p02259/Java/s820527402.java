import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i=0;i<N;i++){
			A[i] = sc.nextInt();
		}
		bubbleSort(A,N);
	}
	public static void bubbleSort(int[] A,int N){
		int flag = 1,count=0;
		while(flag==1){
			flag = 0;
			int i=0;
			for(int j=i;j<N-1;j++){
				if(A[j+1]<A[j]){
					int c = A[j+1];
					A[j+1] = A[j];
					A[j] = c;
					count++;
					flag = 1;
				}
			}
			i++;
		}
		for(int i=0;i<N;i++){
			System.out.print(A[i]);
			if(i!=N-1)System.out.print(" ");
		}
		System.out.printf("\n%d\n",count);
	}
}
