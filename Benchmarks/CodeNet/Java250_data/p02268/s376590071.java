import java.util.*;

public class Main {
	
	public static int totalMatches(int[] array, int[] array2) {
		int total=0;
		for (int i = 0; i < array2.length; i++) {
			if (Binarysearch(array, array2[i])) {
				total++;
			}
		}
		return total;
	}
	
	public static boolean Binarysearch( int[] array,  int search) {
		int left = 0;
		int right = array.length - 1;
		
		while ( left <= right) {
			int mid = (right+left)/2;
			if(array[mid] < search) {
				left = mid + 1;
			}
			else if(array[mid] > search) {
				right = mid - 1;
			}
			else {
				return true;
			}
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sizearray = input.nextInt();

		int array[] = new int[sizearray];

		for (int i = 0; i < sizearray; i++) {
			array[i] = input.nextInt();

		}
		
		int sizearray2 = input.nextInt();
		int array2[] = new int[sizearray2];
		for (int i = 0; i < sizearray2; i++) {
			array2[i] = input.nextInt();

		}
		System.out.println(totalMatches(array, array2));
		
		input.close();
	}
	
}

