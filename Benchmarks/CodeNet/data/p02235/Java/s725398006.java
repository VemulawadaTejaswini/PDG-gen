import java.util.*;

public class Main {
	
	HashMap<String, Integer> cache = new HashMap<String, Integer>();
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numSets = input.nextInt();
		String[] data = new String[numSets*2];
		for(int i = 0; i < numSets*2; i++) {
			data[i] = input.next();
		}
		
		for(int i = 0; i < data.length; i+=2) {
			System.out.println(solveMatrix(data[i], data[i+1]));
		}
		
		
	}
	public static int solveMatrix(String a, String b) {
		int[][] arr = new int[a.length() + 1][b.length() + 1];
		for(int i = 1; i <= a.length(); i++) {
		for(int j = 1; j <= b.length(); j++) {
		if(!a.substring(i-1, i).equals(b.substring(j-1, j))) {
		arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
		} else {
		arr[i][j] = 1 + arr[i-1][j-1];
		}
		}
		}
		return arr[a.length()][b.length()];
	}
}
