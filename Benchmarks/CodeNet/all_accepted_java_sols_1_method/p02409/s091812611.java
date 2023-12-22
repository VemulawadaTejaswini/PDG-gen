import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		int n = Integer.parseInt(line);
		int x[][] = new int[n][4];
		int y[][][] = new int[4][3][10];
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 10; k++){
					y[i][j][k] = 0;
				}
			}
		}
		for(int l = 0; l < n; l++){
			String line1 = reader.readLine();
			String[] sarray = line1.split(" ", -1);
			for(int m = 0; m < 4; m++){
				x[l][m] = Integer.parseInt(sarray[m]);
			}
			y[x[l][0] - 1][x[l][1] - 1][x[l][2] - 1] += x[l][3];
		}
		for(int p = 0; p < 4; p++){
			for(int q = 0; q < 3; q++){
				for(int r = 0; r < 10; r++){
					System.out.print(" " + y[p][q][r]);
				}
				System.out.println();
			}
			if(p < 3){
				System.out.println("####################");
			}
		}
	}
}