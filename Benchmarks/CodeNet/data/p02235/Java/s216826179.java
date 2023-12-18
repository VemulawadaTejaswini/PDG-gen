import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int numberOfDatasets = input.nextInt();
		
		for(int i = 0; i < numberOfDatasets; i++) {
			
			String first = input.next();
			String second = input.next();
			
			System.out.println(compare(first, second));
			
		}
		
	}
	
	public static int compare(String first, String second) {
		
		String firstBlank = " " + first;
		String secondBlank = " " + second;
		
		int length1 = firstBlank.length();
		int length2 = secondBlank.length();
		
		
		int[][] LCS = new int[length1][length2];
		
		for(int i = 1; i < length1; i++) {
			
			for(int j = 1; j < length2; j++) {
				
				char one = firstBlank.charAt(i);
				char two = secondBlank.charAt(j);
				
				if(one == two) {
					
					LCS[i][j] = 1 + LCS[i - 1][j - 1];
					
				}else {
					
					LCS[i][j] = Math.max(LCS[i-1][j], LCS[i][j-1]);
					
				}
				
			}
			
		}
		
		
		return LCS[length1 - 1][length2 - 1];
		
	}

}

