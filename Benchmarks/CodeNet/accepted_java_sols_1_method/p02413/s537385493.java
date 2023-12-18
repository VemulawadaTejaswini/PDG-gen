import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strargs = null;
		int[][] iTable;
		
		strargs = br.readLine().split("\\s+");
		int x = Integer.parseInt(strargs[0]);
		int y = Integer.parseInt(strargs[1]);
		
		iTable = new int[x + 1][y + 1];
		
		for (int i = 0; i < x; i++) {
			strargs = br.readLine().split("\\s+");
			for (int j = 0; j < y; j++) {
				iTable[i][j] = Integer.parseInt(strargs[j]);
				iTable[i][y] += iTable[i][j];
				iTable[x][j] += iTable[i][j];
			}
			iTable[x][y] += iTable[i][y];
		}
		
		for(int i = 0; i < x + 1; i++) {
			for(int j = 0; j < y + 1; j++) {
				System.out.print(iTable[i][j]);
				if (j != y) System.out.print(" ");
			}
			System.out.println();
		}
	}
}