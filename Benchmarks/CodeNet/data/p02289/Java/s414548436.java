import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] S = new int[2000000];
		for(int i= 0 ; i<S.length ; i++) {
			S[i] = -1;
		}
		while(true) {
			String[] input = s.nextLine().split(" ");
			if("insert".equals(input[0])) {
				insert(S, Integer.parseInt(input[1]));
			}else if("extract".equals(input[0])) {
				System.out.println(extract(S));
			}else if("end".equals(input[0])) {
				System.exit(0);
			}
		}
	}

	public static void insert(int[] S, int value) {
		for(int i=0 ; i<S.length ; i++) {
			if(S[i]==-1) {
				S[i] = value;
				break;
			}
		}
		buildMaxHeap(S);
	}

	public static int extract(int[] S) {
		int returnValue = S[0];
		for(int i=0 ; i<S.length ; i++) {
			if(S[i]==-1) {
				S[0] = S[i-1];
				S[i-1] = -1;
				break;
			}
		}
		buildMaxHeap(S);
		return returnValue;
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