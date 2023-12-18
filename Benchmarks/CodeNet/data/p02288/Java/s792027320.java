import java.util.Scanner;

public class Main {
	public static void main( String[] args ) {
		Main heap = new Main();
		heap.exec();
	}

	public void execText() {
		int[] tests = {-90,3,2,1};
		exec(tests);
		for( int value : tests ) {
			if( value == -90 ) {
				continue;
			}
			System.out.println(value);
		}
	}

	public void exec() {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			sc.nextLine();
			String[] lines = sc.nextLine().split(" ");
			int[] heaps = new int[lines.length+1];
			for( int i = 1; i < heaps.length; i++ ) {
				heaps[i] = Integer.parseInt(lines[i-1]);
			}
			exec(heaps);
			StringBuilder bld = new StringBuilder();
			for( int i = 1; i < heaps.length; i++ ) {
				bld.append(" ");
				bld.append(heaps[i]);
			}
			System.out.println(bld.toString());
		} finally {
			if( sc != null ) {
				sc.close();
			}
		}
	}

	public void exec( int[] heaps ) {
		for( int ii = heaps.length/2; ii >= 1; ii-- ) {
			maxHeapfy(heaps, ii);
		}
	}

	public static final void maxHeapfy( int[] heaps, int index ) {
		int leftIndex = left(index);
		int rightIndex = right(index);
		int largest = index;

		if( leftIndex < heaps.length && heaps[leftIndex] > heaps[largest]) {
			largest = leftIndex;
		}

		if( rightIndex < heaps.length && heaps[rightIndex] > heaps[largest] ) {
			largest = rightIndex;
		}

		if( largest != index ) {
			int value = heaps[index];
			heaps[index] = heaps[largest];
			heaps[largest] = value;
			maxHeapfy(heaps,largest);
		}
	}

	public static final int left( int value ) {
		return 2 * value;
	}

	public static final int right( int value ) {
		return 2 * value + 1;
	}
}

