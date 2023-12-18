import java.util.Scanner;

public class Main {
	private static int[] heap;
	private static int n;
	public static void main(String[] atgs){
		final Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		heap=new int[n+1];
		for(int i=1;i<=n;i++) heap[i]=sc.nextInt();
		
		for(int i=n/2;i>=1;i--) maxHeap(i);
		
		for(int i=1;i<=n;i++) System.out.print(" " +heap[i]);	
		System.out.println("");
	}
	
	private static void maxHeap(int i){
		int l=2*i;
		int r=2*i+1;
		int max;
		if(l<=n && heap[l]>heap[i]) max=l;
		else max=i;
		if(r<=n && heap[r]>heap[max]) max=r;
		
		if(max!=i){
			int tmp=heap[i];
			heap[i]=heap[max];
			heap[max]=tmp;
			maxHeap(max);
		}
	}

}