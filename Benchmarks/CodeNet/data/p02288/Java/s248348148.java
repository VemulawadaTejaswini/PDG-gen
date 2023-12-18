import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = Integer.parseInt(s.nextLine());
		int[] maxHeap = new int[cnt];
		String[] tmp = s.nextLine().split(" ");
		for(int i=0 ; i<cnt ; i++) {
			maxHeap[i] = Integer.parseInt(tmp[i]);
		}
		buildMaxHeap(maxHeap);
		for(int i=0 ; i<maxHeap.length ; i++) {
			System.out.print(" " + maxHeap[i]);
		}
		System.out.println("");
	}

	public static void maxHeapify(int[] maxHeap, int index) {
		int leftChild = index*2;
		int rightChild = (index*2)+1;
		int max = maxHeap[index-1];
		if(maxHeap.length>=leftChild && maxHeap[leftChild-1]>maxHeap[index-1]) {
			max = maxHeap[leftChild-1];
		}
		if(maxHeap.length>=rightChild && maxHeap[rightChild-1]>max) {
			max = maxHeap[rightChild-1];
		}
		if(max!=maxHeap[index-1]) {
			if(max==maxHeap[leftChild-1]) {
				int tmp = maxHeap[leftChild-1];
				maxHeap[leftChild-1] = maxHeap[index-1];
				maxHeap[index-1] = tmp;
				maxHeapify(maxHeap, leftChild);
			}else if(max==maxHeap[rightChild-1]) {
				int tmp = maxHeap[rightChild-1];
				maxHeap[rightChild-1] = maxHeap[index-1];
				maxHeap[index-1] = tmp;
				maxHeapify(maxHeap, rightChild);
			}
		}
	}

	public static void buildMaxHeap(int[] maxHeap) {
		for(int i=(maxHeap.length/2) ; i>0 ; i--) {
			maxHeapify(maxHeap, i);
		}
	}
}