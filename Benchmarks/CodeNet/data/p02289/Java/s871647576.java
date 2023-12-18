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
				insert(sc.nextInt());
			}else if(s.startsWith("ex")) {
				int ans = extractMax();
				System.out.println(ans);
			}else if(s.startsWith("en")){
				break;
			}
		}
		sc.close();
	}
	
	void insert(int key) {
		H++;
		S[H] = -Integer.MAX_VALUE;
		heapIncreaseKey(H, key);
	}
	
	void heapIncreaseKey(int i, int key) {
		if(key < S[i]) return;
		S[i] = key;
		while(i > 1 && S[i/2] < S[i]) {
			int tmp = S[i];
			S[i] = S[i/2];
			S[i/2] = tmp;
			i = i/2;
		}
	}
	
	int extractMax() {
		if(H < 1) return -Integer.MAX_VALUE;
		int max = S[1];
		S[1] = S[H];
		H--;
		maxHeapify(1);
		return max;
	}
	
	void maxHeapify(int i) {
		int l = i*2;
		int r = i*2+1;
		if(l <= H && S[l] > S[i]) {
			largest = l;
		}else {
			largest = i;
		}
		if(r <= H && S[r] > S[largest]) {
			largest = r;
		}
		if(largest != i) {
			int tmp = S[i];
			S[i] = S[largest];
			S[largest] = tmp;
			maxHeapify(largest);
		}
		
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
