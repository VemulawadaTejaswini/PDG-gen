import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static void radixSort(int[] a) {
	ArrayList<ArrayDeque<Integer>> buckets = new ArrayList<ArrayDeque<Integer>>(10);
	for (int i = 0; i < 10; i++) {
	    buckets.add(new ArrayDeque<Integer>());
	}

	for (int b : a) {
	    buckets.get(9).add(b);
	}

	int cur = 1;
	while (buckets.get(0).size() < a.length) {
	    for (ArrayDeque<Integer> deque : buckets) {
		int size = deque.size();
		for (int s = 0; s < size; s++) {
		    int p = deque.poll();
		    int digit = p / cur;
		    digit %= 10;
		    buckets.get(digit).add(p);
		}
	    }
	    cur *= 10;
	}

	for (int i = 0; i < a.length; i++) {
	    a[i] = buckets.get(0).poll();
	}
    }

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int N = scanner.nextInt();
	int[] a = new int[N];
	for (int i = 0; i < a.length; i++) {
	    a[i] = scanner.nextInt();
	}
	radixSort(a);
	StringBuilder builder = new StringBuilder();
	for (int i = 0; i < a.length; i++) {
	    if (i > 0) {
		builder.append(" ");
	    }
	    builder.append(a[i]);
	}
	System.out.println(builder.toString());
	scanner.close();
    }
}