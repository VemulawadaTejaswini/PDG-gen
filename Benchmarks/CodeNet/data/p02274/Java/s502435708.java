import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

class Main {

	final static int MAX = 200_000;
	static long[] leftArr = new long[MAX/2+2];
	static long[] rightArr = new long[MAX/2+2];



	public static void main(String[] args) {

		int n = 0;
		long[] arr = null;


		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			n = Integer.parseInt(br.readLine());
			arr = Stream.of(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

		} catch (IOException e) {
			e.printStackTrace();
		}

		long ans = mergeSort(arr, n, 0, n);

		System.out.println(ans);

	}

	private static long mergeSort(long[] arr, int n, int left, int right) {

		int mid;
		long v1, v2, v3;

		if ( left+1 < right ) {
			mid = (left+right)/2;
			v1 = mergeSort(arr, n, left, mid);
			v2 = mergeSort(arr, n, mid, right);
			v3 = merge(arr, n, left, mid, right);
			return v1 + v2 + v3;
		} else {
			return 0;
		}
	}

	private static long merge(long[] arr, int n, int left, int mid, int right) {

		int i, j, k;
		long cnt = 0;
		int n1 = mid - left;
		int n2 = right - mid;

		for (i = 0; i < n1; i++) {
			leftArr[i] = arr[left+i];
		}
		for (i = 0; i < n2; i++) {
			rightArr[i] = arr[mid+i];
		}
		leftArr[n1] = Long.MAX_VALUE;
		rightArr[n2] = Long.MAX_VALUE;

		i = 0; j = 0;
		for(k = left; k < right; k++) {
			if(leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i++];
			} else {
				arr[k] = rightArr[j++];
				cnt += (n1-i);
			}
		}
		return cnt;
	}
}