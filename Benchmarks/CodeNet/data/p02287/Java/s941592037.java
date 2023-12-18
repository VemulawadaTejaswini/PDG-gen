
import java.util.Scanner;

public class Main { 
	private int[] heap;
	private int counter = 1;
	
	public Main(int size) {
		heap = new int[size + 1];
	}
	
	
	public void insert(int num) {
		if (heap.length <= counter) {
			return;
		}
		heap[counter] = num;
		counter++;
	}
	
	public void printHeap() {
		
		for (int i = 1; i < heap.length; i++) {
			String ans = "node " + (i) + ": ";
			int key = i;
			int parent = (int) Math.floor(i/2);
			int left = 2 * i;
			int right = (2 * i) + 1;
			
			ans += "key = " + heap[key] + ", ";
			
			if (parent > 0) {
				ans += "parent key = " + heap[parent] + ", ";
			}
			
			if (left < heap.length) {
				ans += "left key = " + heap[left] + ", ";
			}
			
			if (right < heap.length) {
				ans += "right key = " + heap[right] + ", ";
			}
			
			System.out.println(ans);
		}
		
		
		return;
	}
	
	
	// Driver code 
	public static void main(String[] arg) { 
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		Main bHeap = new Main(n);
		for(int i = 0; i < n; i ++) {
			bHeap.insert(in.nextInt());
		}
		in.close();
		
		bHeap.printHeap();
	} 
}
