import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		int[] A=new int[N]; 
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++){
			if(i==N-1){
				System.out.println(A[i]);					
			}else{
			System.out.print(A[i]+" ");
			}
		}
		insertionSort(A,N);
	}
	static void insertionSort(int[] ar,int n){
		for(int i=1;i<ar.length;i++){
			int key=ar[i];
			int j=i-1;
			while(j>=0&&ar[j]>key){
				ar[j+1]=ar[j];
				j--;
			}
			ar[j+1]=key;
			for(int k=0;k<n;k++){
				if(k==n-1){
					System.out.println(ar[k]);					
				}else{
				System.out.print(ar[k]+" ");
				}
			}
		}
	}
}