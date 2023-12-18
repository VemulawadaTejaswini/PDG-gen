import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int h;
		Scanner in = new Scanner(System.in);
		h = in.nextInt();
		int[] heap = new int[h];
		for(int i = 0; i < h; i++) {
			heap[i] = in.nextInt();
		}
		for(int i = h/2; i >= 0; i--) {
			heap = maxHeapify(heap, i, h);
		}
		for(int n: heap) {
			System.out.print(" " + n);
		}
		System.out.println();
	}
	
	public static int[] maxHeapify(int[] a, int i, int h) {
		int l = (2 * i) + 1;
		int r = (2 * i) + 2;
		int largest;
		
		if(l < h && a[l] > a[i]) {
			largest = l;
		}
		else {
			largest = i;
		}
		if(r < h && a[r] > a[largest]) {
			largest = r;
		}
		if(largest != i) {
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
			return maxHeapify(a, largest, h);
		}
		else {
			return a;
		}
	}
}
