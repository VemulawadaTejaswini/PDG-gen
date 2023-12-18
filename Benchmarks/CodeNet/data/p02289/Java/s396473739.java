import java.util.Scanner;
public class Main {
private static Scanner s = new Scanner(System.in);
static int count = 0;
static int[] A = new int[2000001];
public static void main(String[] args) {
	int k;
	while(true) {
		String com = s.next();
		if(com.equals("insert")) {
			k = s.nextInt();
			insert(k);
		}else if(com.equals("extract")) {
			System.out.println(extract());
		}else {
			return;
		}
	}
}
static void insert(int n) {
	count++;
	A[count] = n;
	int i = count;
	while(i > 1 && A[i/2] < A[i]) {
		int tmp = A[i/2];
		A[i/2] = A[i];
		A[i] = tmp;
		i /= 2;
	}
}

static int extract() {
	if(count < 1) return -1;
	int set = A[1];
	A[1] = A[count];
	count--;
	maxHeapify(1);
	return set;
}

static void maxHeapify(int i) {
	int l = i * 2;
	int r = i * 2 + 1;
	int max;
	if(l <= count && A[l] > A[i]) {
		max = l;
	} else {
		max = i;
	}
	if(r <= count && A[r] > A[max]) {
		max = r;
	}
	if(max != i) {
		int tmp = A[i];
		A[i] = A[max];
		A[max] = tmp;
		maxHeapify(max);
	}
}
}
