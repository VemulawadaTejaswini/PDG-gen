import java.util.*;

public class Main {
	static int swap=0;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] A =new int[N];
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		BubbleSort(A);
		for(int i=0;i<N;i++){
			if(i==N-1){
				System.out.println(A[i]);
			}else{
				System.out.print(A[i]+" ");
			}
		}
		System.out.println(swap);
	}
	
	static void BubbleSort(int[] a){
		for(int i=0;i<a.length;i++){
			for(int j=a.length-1;j>i;j--){
				if(a[j]<a[j-1]){
					int t=a[j];
					a[j]=a[j-1];
					a[j-1]=t;
					swap++;
				}
			}
		}
	}
}