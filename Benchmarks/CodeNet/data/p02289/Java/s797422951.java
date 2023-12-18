import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	private static List<Integer> heap;
	static {
		heap = new ArrayList<Integer>();
		heap.add(-1);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt = 1;
		String line;
		while (!(line = br.readLine()).equals("end")) {
			if (line.startsWith("insert")) {
				insert(Integer.parseInt(line.split(" ")[1]));
			} else {
				int val = extractMax();
				System.out.println(val);
			}
			if (cnt % 100000 == 0) {
				System.gc();
			}
			cnt++;
		}

		if (br != null) {
			br.close();
			br = null;
		}
	}

	private static int extractMax() {
		int max = heap.get(1);
		heap.set(1, heap.get(heap.size() - 1));
		heap.remove(heap.size() - 1);
		maxHeapify(1);
		return max;
	}

	private static void maxHeapify(int i) {
		int l = left(i);
		int r = right(i);

		int largest;
		if (l < heap.size() && heap.get(l) > heap.get(i)) {
			largest = l;
		} else {
			largest = i;
		}
		if (r < heap.size() && heap.get(r) > heap.get(largest)) {
			largest = r;
		}

		if (largest != i) {
			swap(i, largest);
			maxHeapify(largest);
		}
	}

	private static void swap(int i, int j) {
		int tmp = heap.get(i);
		heap.set(i, heap.get(j));
		heap.set(j, tmp);
	}

	private static int parent(int i) {
		return i / 2;
	}

	private static int left(int i) {
		return i * 2;
	}

	private static int right(int i) {
		return i * 2 + 1;
	}

	private static void insert(int key) {
		heap.add(Integer.MIN_VALUE);
		increaseKey(key);
	}

	private static void increaseKey(int key) {
		heap.add(key);
		int i = heap.size() - 1;
		while (i > 1 && heap.get(parent(i)) < heap.get(i)) {
			swap(i, parent(i));
			i = parent(i);
		}
	}
}