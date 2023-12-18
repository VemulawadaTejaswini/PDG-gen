import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		insertionSort(A,N);
	}
	public static void insertionSort(int[] A,int N){
		show(A,N);
		for(int i=1;i<N;i++){
			int v=A[i];
			int j=i-1;
			while(j>=0 && A[j]>v){
				A[j+1]=A[j];
				j--;
			}
			A[j+1]=v;
			show(A,N);
		}
	}
	public static void show(int[] A,int N){
		for(int i=0;i<N-1;i++){
			System.out.print(A[i]+" ");
		}
		System.out.println(A[N-1]);
	}
}
