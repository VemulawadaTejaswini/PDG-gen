import java.util.Scanner;

public class Main {

	
	public static void main (String args[]) {
		
	//input array length/initialize array S of length n
	Scanner scan = new Scanner(System.in);
	int arrayLenS = scan.nextInt();
	int[] arrayS = new int[arrayLenS];
	
	//int[] myArray = {1, 2, 3, 4, 5, 6};
	
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
	
	//count number of matches between the arrays
   	int matchCount = 0;
	for(int i = 0; i < arrayT.length; i++) {
		for(int j = 0; j < arrayS.length; j++) {
			if(arrayS[j]==arrayT[i]) {
				matchCount += 1;
				break;	
			}
		}
	}
	System.out.println(matchCount);
	
	}
}
