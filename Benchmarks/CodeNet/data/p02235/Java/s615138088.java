
import java.util.Scanner;
import java.lang.Math;

public class Main {
	
	public static int lcs(String firstStr, String secStr) {
		int len1 = firstStr.length();
		int len2 = secStr.length();
		char[] char1 = firstStr.toCharArray();
		char[] char2 = secStr.toCharArray();
		
		int[][] seqTable = new int[len1+1][len2+1];
		
		for (int i = 0; i <= len1;i++) {
			seqTable[i][0] = 0; // fill the first col with zeros
		}
		
		for (int i = 1; i <= len2;i++) {
			seqTable[0][i] = 0;  // fill the first row with zeros
		}		
		
		for (int i = 1; i<=len1;i++) {
			for (int j = 1; j<=len2;j++) {
				if (char1[i-1] == char2[j-1]) {
					seqTable[i][j] = seqTable[i-1][j-1]+1;
				} else {
					seqTable[i][j] = Math.max(seqTable[i-1][j], seqTable[i][j-1]);
				}
			}
		}
		
		return seqTable[len1][len2];
	}
	
	public static void main(String[] argv) {
		Scanner input =  new Scanner(System.in);
		int setNum = input.nextInt();
		input.nextLine();
		for (int i=0; i<setNum; i++) {
			String firstStr = input.nextLine();
			String secStr = input.nextLine();
			
			System.out.println(lcs(firstStr,secStr));
			
			// System.out.println(firstStr);
			// System.out.println(secStr);
		}
		input.close();
	}
}

