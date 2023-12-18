import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int datasets = Integer.parseInt(in.nextLine());
		
		int[] output = new int[datasets];
		
		for (int i = 0; i < datasets; i++) {
			String set1 = in.nextLine();
			String set2 = in.nextLine();
			output[i] = LCS(set1, set2);
		}
		in.close();
		
		for (int i = 0; i < datasets; i++) {
			System.out.println(output[i]);
		}
	}
	
	public static int LCS(String set1, String set2) {
		int[][] substring = new int[set1.length()+1][set2.length()+1];
		
		for (int i = 0; i < set1.length()+1; i++) {
			for (int j = 0; j < set2.length()+1; j++) {
				if (i == 0 || j == 0) {
					substring[i][j] = 0;
				} else if (set1.charAt(i-1) == set2.charAt(j-1)) {
						substring[i][j] = substring[i-1][j-1] + 1;
						
				} else {
					substring[i][j] = Math.max(substring[i-1][j], substring[i][j-1]);
				}
			}
		}
		
		return substring[set1.length()][set2.length()];
	}
}

