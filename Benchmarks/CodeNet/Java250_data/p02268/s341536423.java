
import java.util.Scanner;

public class Main {

	public static int callBinarySearch(int[] first, int[] second) {
		int output = 0;

		for(int j = 0 ;j < second.length;j++) {
			if(binarySearch(first,second[j]) == 1) {
				output++;
			}
		}
		return output;
	}

	public static int binarySearch(int[] array, int x) {
		
		int left = 0;
		int right = array.length-1;
		int mid ;
		while(left <= right) {
			mid = (left+right)/2;
			if(array[mid] == x) {
				return 1;
			}else if(array[mid] > x) {
				right = mid-1;
			}else {
				left = mid+1;
			}
		}
		return 0;
	}

	public static int[] toArray(String s, int l) {
		Scanner in = new Scanner(s);
		int[] output = new int[l];
		for (int i = 0; i < l; i++) {
			output[i] = in.nextInt();
		}
		in.close();
		return output;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int lengthOne, lengthTwo;
		String arrayOne, arrayTwo;

		lengthOne = in.nextInt();
		in.nextLine();
		arrayOne = in.nextLine();

		lengthTwo = in.nextInt();
		in.nextLine();
		arrayTwo = in.nextLine();

		int[] first = toArray(arrayOne, lengthOne);
		int[] second = toArray(arrayTwo, lengthTwo);
		System.out.println(callBinarySearch(first, second));
		

		in.close();
	}
}

