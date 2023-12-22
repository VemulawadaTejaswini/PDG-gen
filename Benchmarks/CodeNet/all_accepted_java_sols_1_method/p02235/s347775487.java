import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//get first part of input
		int numOfDatasets = input.nextInt();
		String[] sequences = new String[numOfDatasets * 2];
		
		input.nextLine();
		
		//get sequences from input
		for(int i = 0; i < sequences.length; i++) {
			sequences[i] = input.nextLine();
		}
		
		for(int i = 0; i < sequences.length; i += 2) {
			
			//initialize matrix
			int[][] matrix = new int[sequences[i].length() + 1][sequences[i + 1].length() + 1];
			
			//set first row and column to all 0s
			for(int j = 0; j < matrix.length; j++) {
				matrix[j][0] = 0;	
			}
			for(int j = 1; j < matrix[0].length; j++) {
				matrix[0][j] = 0;
			}
			
			//complete the table
			for(int j = 0; j < matrix.length - 1; j++) {
				
				char rowChar = sequences[i].charAt(j);
				
				for(int k = 0; k < matrix[0].length - 1; k++) {
					
					char columnChar = sequences[i+1].charAt(k);
					
					if(rowChar == columnChar) {
						matrix[j+1][k+1] = matrix[j][k] + 1;
					}
					else {
						matrix[j+1][k+1] = java.lang.Math.max(matrix[j][k+1], matrix[j+1][k]);
					}
					
				}
				
			}
			
			System.out.println(matrix[matrix.length-1][matrix[0].length-1]);
			
		}
		
	}

}
