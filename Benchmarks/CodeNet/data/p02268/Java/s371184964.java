import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		int S[] = new int[input];
		
		for (int i = 0; i < input; i++)
			S[i] = in.nextInt();
			int nextInput = in.nextInt();
		
		int T[] = new int[nextInput];
		for (int i = 0; i < nextInput; i++)
			T[i] = in.nextInt();
		
		int C = 0;
		for (int i = 0; i < nextInput; i++) {	
			if (binarySearch(S, T[i]))	
				C++;		
		}
		
		System.out.println(C);
		
		}
		
		public static boolean binarySearch(int arr[], int param) {
		
			int left = 0; 
			int right = arr.length - 1;
			while (left <= right) {	
					int middle = (left + right) / 2;
					if (arr[middle] == param)
						return true;
					if (arr[middle] < param)
						left = middle + 1;
					else
						right = middle - 1;
		}
				return false;
	
	}
}
