import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	private static int binary(int[] array, int query) {
		int left = 0;
		int right = array.length - 1;
		
		while (left <= right) {
			int middle = (left + right)/2;
			
			if(array[middle] == query) {
				return 1;
			}
			
			if(array[middle] > query) {
				right = middle -1;
			}
			if(array[middle] < query) {
				left = middle +1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = Integer.parseInt(in.next());
		int[] nArray = new int[n];
		
		for(int i = 0; i < n; i++) {
			int nString = Integer.parseInt(in.next());
			nArray[i] = nString;
		}

		int q = Integer.parseInt(in.next());
		int[] qArray = new int[q];
		
		for(int j = 0; j < q; j++) {
			int qString = Integer.parseInt(in.next());
			qArray[j] = qString;
		}
		
		int qCount = 0;
		for(int qStr : qArray) {
			qCount += binary(nArray, qStr);
		}
		System.out.println(qCount);
		in.close();
	}
}
