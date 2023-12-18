import java.util.Scanner;

public class Main {

	
	public static void main (String args[]) {
		
		//input array length/initialize array S of length n
		Scanner scan = new Scanner(System.in);
		int arrayLenS = scan.nextInt();
		int[] arrayS = new int[arrayLenS];
				
		//create first array S
		for(int i = 0; i < arrayLenS; i++) {
			int arrayNumsS = scan.nextInt();
			arrayS[i] = arrayNumsS;
		}
		
		//initialize length of array T -- enter array length q
		int arrayLenT = scan.nextInt();
		int[] arrayT = new int[arrayLenT];
		
		//create second array T
		for(int i = 0; i < arrayLenT; i++) {
			int arrayNumsT = scan.nextInt();
			arrayT[i] = arrayNumsT;
		}	
		
		//call the binary function and add to counter when its true
		int matchCount = 0;
		for(int i = 0; i < arrayLenT; i++) {
			if(binarySearch(arrayS, arrayT[i])) {
				matchCount += 1;
			}
		}
		System.out.println(matchCount);
	}
	
	public static boolean binarySearch(int[] arr, int target){
		int right = arr.length - 1;
		int left = 0;
		
		//loop to set new middle value and check to see if its equal
		while(left <= right) {
			int middle = (right + left)/2;
			if(arr[middle] == target) {
				return true;
			}
			
			// if the middle is > target then iterate to left side of array
			else if(arr[middle] > target){
				right = middle - 1;
			}
			
			//if the middle is  less than target loop to right
			else {
				left = middle + 1;
			}
		}
		return false;
	}
}
