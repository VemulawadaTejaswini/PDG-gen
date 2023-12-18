import java.io.*;

public class Main{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] tableSize = br.readLine().split(" ");
			int n = Integer.parseInt(tableSize[0]);
			int m = Integer.parseInt(tableSize[1]);
			int[][] table = new int[n][m];

			for (int i = 0; i < n; i++){
				String[] str = br.readLine().split(" ");
				for(int j = 0; j < m; j++){
					table[i][j] = Integer.parseInt(str[j]);
				}
			}

			int[][] newTable = new int[n+1][m+1];
			int[] sumX = new int[m];
			int[] sumY = new int[n];
			int sumAll = 0;

			for (int x = 0; x < n+1; x++){
				if (x < n){
					for (int y = 0; y < m+1; y++){
						if(y < m){
							newTable[x][y] = table[x][y];
							sumAll += newTable[x][y];
						}else{
							for (int a = 0; a < m; a++){
								sumY[x] += table[x][a];
								newTable[x][y] = sumY[x];
							}
						}
					}
				}else{
					for (int z = 0; z < m+1; z++){
						if (z < m){
							for (int b = 0; b < n; b++){
							sumX[z] += table[b][z];
							newTable[x][z] = sumX[z];
							}
						}else{
							newTable[x][z] = sumAll;
						}
					}
				}
			}

			for (int s = 0; s < n+1; s++){
				for (int t = 0; t < m+1; t++){
					if (t < m ){
						System.out.print(newTable[s][t] + " ");
					}else{
						System.out.print(newTable[s][t]);
					}
				}
				System.out.println();
			}
		}catch(IOException e){
		System.out.println(e);
		}
	}
}