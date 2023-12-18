import java.util.Scanner;
import java.lang.Math;

public class Main {
	private static int[] A;
	private static int H;
	private static int val;
	private static int l;
	private static int r;
	
	public static void swap(int[] A, int idx1, int idx2) {
		int temp = A[idx1];
		A[idx1] =  A[idx2];
		A[idx2] = temp;
	}
	
	public static void maxHeapify(int[] A,int i) {
		int largest;
		
		l = i*2; // get the left child index 
		r = i*2+1;
		
		// select the node which has the maximum value
		if (l <= H && A[l] > A[i]) {
			largest = l;
		} else {
			largest = i;
		}
		
		if (r <= H && A[r] > A[largest]) {
			largest = r;
		}
		
		if  (largest != i) {
			swap(A, i, largest);
			maxHeapify(A, largest);
		}
	}
	
	
	public static void buildMaxHeap(int[] A) {
		val =H/2;
		// val = (int) Math.ceil(H/2)+1;
		for(int i = val; i >0; i--) {
			maxHeapify(A, i);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		H = input.nextInt();
		A =  new int[H+1];
		
		// Take inputs to build an array of trees
		for (int i=1; i <= H; i++) {
			A[i] = input.nextInt();
		}
		input.close();
		buildMaxHeap(A);
		
		// System.out.print(" ");
		for (int i=1; i <= H; i++) {
			System.out.print(" "+A[i]); 
		}
		// System.out.print(" 3 2 1");
		System.out.println();
	}
}
