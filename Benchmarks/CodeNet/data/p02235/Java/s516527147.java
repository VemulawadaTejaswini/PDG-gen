import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		LCSOperations operation = new LCSOperations();
		int q = in.nextInt();
		
		in.nextLine();
		
		for (int i = 0; i < q; i++) {
			String setOne = in.nextLine();
			String setTwo = in.nextLine();
			setOne = setOne + " ";
			setTwo = setTwo + " ";
			int[][] LCS = new int[setOne.length()][setTwo.length()];
			System.out.println(operation.findLCS(LCS, setOne, setTwo));
			//System.out.println(operation.findLCS(setOne, setTwo));
		}
	}

}

class LCSOperations {
	
	public int findLCS(int[][] LCS, String a, String b) {
		
		for (int j = 0; j < b.length(); j++) {
			LCS[0][j] = 0;
		}
		
		for (int i = 0; i < a.length(); i++) {
			LCS[i][0] = 0;
		}
		
		for (int i = 1; i <= a.length() - 1; i++) {
			for (int j = 1; j <= b.length() - 1; j++) {
				if (a.charAt(i - 1) != b.charAt(j - 1)) {
					LCS[i][j] = Math.max(LCS[i-1][j], LCS[i][j-1]);
				} else {
					LCS[i][j] = 1 + LCS[i-1][j-1];
				}
			}
		}
		return LCS[a.length() - 1][b.length() - 1];
	}
	
}
