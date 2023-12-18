
import java.util.Scanner;

public class Main {
	static int max = 2000001;
	static int length = 0;
	static int[] A = new int[max];
	
	
	static int left(int i) {
		return (i * 2);
	}
	static int right(int i) {
		return (i * 2 + 1);
	}
	static int parent(int i) {
		return (i/2);
	}
	
	void buildMaxHeap(int[] A) {
		for (int i = ((length - 1)/2); i >= 1; i--) {
			MaxHeapify(A, i);
		}
	}
	
	static void MaxHeapify(int[] A,int i) {
		int largest = i;
		int left = left(i);
		int right = right(i);
		int tmp;
		
		if (left <= length && A[left] > A[i]) {
			largest = left;
		}
		
		if (right <= length && A[right] > A[largest]) {
			largest = right;
		}
		if (largest != i) { //Swap 
			tmp = A[i];
			A[i] = A[largest];
			A[largest] = tmp;
			MaxHeapify(A, largest);
		}
	}
	static void insert(int i) {
		length++;
		inserter(i, length);
	}
	static void inserter(int element, int i) {
		if (element < 0) {
			return;
		}
		A[i] = element;
		while (i > 1 && A[i/2] < element) {
			A[i] = A[i/2];
			A[i/2] = element;
			i = i/2;
		}
	}
	
	static int extract() {
		int max = A[1];
		A[1] = A[length];
		length--;
		MaxHeapify(A, 1);
		return max;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String st = "";
		while (! (st.equals("end"))) {
			st = in.next();
			if (st.equals("insert")) {
				int i = in.nextInt();
				insert(i);
			}
			else if (st.equals("extract")) {
				System.out.println(extract());
			}
			print();
		}
	}
	static void print() {
		/*
		for (int i = 1; i < length+3; i++) {
			System.out.print(A[i] + " ");
			
		}
		System.out.println();
		System.out.println(length);
		*/
	}
	
}

