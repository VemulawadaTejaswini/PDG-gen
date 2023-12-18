import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] S = new int[2000000];
		int tailIndex = 0;
		for(int i= 0 ; i<S.length ; i++) {
			S[i] = -1;
		}
		while(true) {
			String[] input = s.nextLine().split(" ");
			if("insert".equals(input[0])) {
				tailIndex++;
				insert(S, Integer.parseInt(input[1]), tailIndex);
			}else if("extract".equals(input[0])) {
				System.out.println(extract(S, tailIndex));
				tailIndex--;
			}else if("end".equals(input[0])) {
				System.exit(0);
			}
		}
	}

	public static void insert(int[] S, int value, int tail) {
		S[tail] = value;
		int parent = -1;
		if(tail==1)
			return;
		else{
			parent = tail/2;
		}
		while((S[parent] < S[tail]) && parent>0) {
			int tmp = S[parent];
			S[parent] = S[tail];
			S[tail] = tmp;
			tail = parent;
			parent = tail/2;
		}
	}

	public static int extract(int[] S, int tail) {
		int returnValue = S[1];
		S[1] = S[tail];
		S[tail] = -1;
		if(S[1]<S[2] || S[1]<S[3])
			maxHeapify(S, 1);
//			buildMaxHeap(S, tail+1);
		return returnValue;
	}


	public static void maxHeapify(int[] maxHeap, int index) {
		int leftChild = index*2;
		int rightChild = (index*2)+1;
		int max = maxHeap[index];
		if(maxHeap.length>=leftChild && maxHeap[leftChild]>maxHeap[index]) {
			max = maxHeap[leftChild];
		}
		if(maxHeap.length>=rightChild && maxHeap[rightChild]>max) {
			max = maxHeap[rightChild];
		}
		if(max!=maxHeap[index]) {
			if(max==maxHeap[leftChild]) {
				int tmp = maxHeap[leftChild];
				maxHeap[leftChild] = maxHeap[index];
				maxHeap[index] = tmp;
				maxHeapify(maxHeap, leftChild);
			}else if(max==maxHeap[rightChild]) {
				int tmp = maxHeap[rightChild];
				maxHeap[rightChild] = maxHeap[index];
				maxHeap[index] = tmp;
				maxHeapify(maxHeap, rightChild);
			}
		}
	}

	public static void buildMaxHeap(int[] maxHeap, int tail) {
		for(int i=(tail/2) ; i>0 ; i--) {
			maxHeapify(maxHeap, i);
		}
	}
}