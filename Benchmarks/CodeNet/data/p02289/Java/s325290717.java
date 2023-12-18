import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int[] S;
	int H = 0;
	int largest;
	void run() {
		Scanner sc = new Scanner(System.in);
		S = new int[2000001];
		while(true) {
			String s = sc.next();
			if(s.startsWith("i")){
				insert(S, sc.nextInt());
			}else if(s.startsWith("ex")) {
				int ans = extractMax(S);
				System.out.println(ans);
			}else if(s.startsWith("en")){
				break;
			}
		}
		sc.close();
	}
	
	void insert(int[] A, int key) {
		H++;
		A[H] = -Integer.MAX_VALUE;
		heapIncreaseKey(A, H, key);
	}
	
	void heapIncreaseKey(int[] A, int i, int key) {
		if(key < A[i]) return;
		A[i] = key;
		while(i > 1 && A[i/2] < A[i]) {
			int tmp = A[i];
			A[i] = A[i/2];
			A[i/2] = tmp;
			i = i/2;
		}
	}
	
	int extractMax(int[] A) {
		if(H < 1) return -Integer.MAX_VALUE;
		int max = A[1];
		A[1] = A[H];
		H--;
		maxHeapify(A,1);
		return max;
	}
	
	void maxHeapify(int[] A, int i) {
		int l = i/2;
		int r = i/2+1;
		if(l <= H && A[l] > A[i]) {
			largest = l;
		}else {
			largest = i;
		}
		if(r <= H && A[r] > A[largest]) {
			largest = r;
		}
		if(largest != i) {
			int tmp = A[i];
			A[i] = A[largest];
			A[largest] = tmp;
			maxHeapify(A, largest);
		}
		
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
