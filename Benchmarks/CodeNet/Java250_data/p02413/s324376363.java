import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
 
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] rc = br.readLine().split(" ");
    	int r = Integer.parseInt(rc[0]);
    	int c = Integer.parseInt(rc[1]);
    	int[][] table = new int[r + 1][c + 1];
    	for (int i = 0; i < r; i++) {
    		table[i] = convertInt(br.readLine().split(" "));
    	}
    	for (int i = 0; i <= r; i++) {
    		for (int j = 0; j <= c; j++) {
    			if (j == c) {
    				continue;
    			}
    			if (i != r) {
    				table[r][j] = table[r][j] + table[i][j];
    			}
    			table[i][c] = table[i][c] + table[i][j];
    		}
    	}
    	for (int[] row : table) {
    		int cnt = 0;
    		for (int n : row) {
    			System.out.print(n);
    			if (cnt != c) {
    				System.out.print(" ");
    			}
    			cnt++;
    		}
    		System.out.println("");
    	}

    }

    private static int[] convertInt(String[] str) {
    	int len = str.length;
    	int[] iArray = new int[len + 1];
    	for (int i = 0; i < len; i++) {
    		iArray[i] = Integer.parseInt(str[i]);
    	}
    	return iArray;
    }
}