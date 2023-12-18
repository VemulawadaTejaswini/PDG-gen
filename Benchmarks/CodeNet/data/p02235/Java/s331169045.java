
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		
		int numOfTests = Integer.parseInt(scin.nextLine());
		
		while (numOfTests > 0) {
			String str1 = scin.nextLine();
			String str2 = scin.nextLine();
			
			System.out.println("" + getCommonCharLength(str1, str2));
			numOfTests -= 1;
		}
	}
	
	
	public static int getCommonCharLength(String s1, String s2) {
		int[][] table = new int[s1.length()][s2.length()];
		for (int i = 0; i < s1.length(); i++) {
			for (int ii = 0; ii < s2.length(); ii++) {
				if (s1.charAt(i) == s2.charAt(ii)) {
					if (i > 0 && ii > 0) {
						table[i][ii] = table[Integer.max(0, i-1)][Integer.max(0, ii-1)] + 1;
					}else {
						table[i][ii] = 1;
					}
					
				}else {
					if(i > 0 && ii> 0) {
						table[i][ii] = Integer.max(table[i][Integer.max(0, ii - 1)], table[Integer.max(0, i - 1)][ii]);
					}else if (ii > 0){
						table[i][ii] = table[i][ii-1];
					}else if (i > 0){
						table[i][ii] = table[i-1][ii];
					}
				}
			}
		}
		
		
		return table[s1.length() - 1][s2.length() - 1];
	}
	
}

