import java.util.Scanner;


public class Main {
	
	public static int count(int[] sorted, int[] intSet) {
		
		int result = 0;
		int low = 0;
		int high = sorted.length;
		
		for(int i = 0; i < intSet.length; i++) {

			result = result + binary(sorted, intSet[i], low, high);
			
		}
		return result;
	}

	public static int binary(int[] ls, int num, int low, int high) {
		
		if(high >= low) {
			int mid = low + (high - low) / 2;

			if(ls[mid] == num) {
				return 1;
			}
			else if (ls[mid] > num) { 
				return binary(ls, num, low, mid - 1);
			}
			else { 
				return binary(ls, num, mid+1, high);
			}
		}
		else 
			return 0;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numSorted = in.nextInt();
		int[] sorted = new int[numSorted];
		
		for(int i = 0; i < numSorted; i++) {

			sorted[i] = in.nextInt();

		}
		
		int setNum = in.nextInt(); 
		int[] intSet = new int[setNum];

		for(int j = 0; j < setNum; j++) {

			intSet[j] = in.nextInt();

		}

		int result = count(sorted, intSet);

		System.out.println(result);


		in.close();
		
	}

}

