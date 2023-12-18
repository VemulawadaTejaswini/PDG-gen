import java.util.Scanner;

public class Main {
	
	public static Boolean BinarySearch(int[] Value, int input, int left, int right) {
		int middle = left + (right-left)/2;  // 
		if (right < left) {
			return false;  // This means that the algorithm is not sorted
			}
		else if (Value[middle] > input) {
			return BinarySearch(Value,input,left,middle-1);  
			}
		else if (Value[middle] < input) {
			return BinarySearch(Value,input,middle+1,right); 
			}
		else {  
			return true;
			}
	}
	
	public static int contains(int[] Value, int[] Array) {
		int sum = 0;
		int left = 0;
		int right = Value.length - 1;
		for (int elements : Array) {
			if (BinarySearch(Value, elements, left, right)) {  // iterates through each value in T and searches for it in S
				sum++;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int array1 = in.nextInt();
		int[] Value = new int[array1];
		for (int i = 0; i < array1; i++) {
			int number = in.nextInt();
			Value[i] = number;
		}
		int array2 = in.nextInt();
		int[] Array = new int[array2];
		for (int i = 0; i < array2; i++) {
			int number = in.nextInt();
			Array[i] = number;
		}
		in.close();
		int value = contains(Value,Array);
		System.out.println(value);
	}

}
