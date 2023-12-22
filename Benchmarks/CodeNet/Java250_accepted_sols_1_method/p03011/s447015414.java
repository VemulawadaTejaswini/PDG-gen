import java.util.Arrays;

import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		int cntNums[] = new int[3];
		 
		 
		for(int i = 0; i <= 2; i++){
		    
			int inputNums = sc.nextInt();
		    cntNums[i] = inputNums;
		 
		}
		 
		Arrays.sort(cntNums);
		 
		System.out.println(cntNums[0] + cntNums[1]);
	
	}
}