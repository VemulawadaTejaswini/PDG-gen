import java.io.*;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sc = br.readLine();
		int n = Integer.parseInt(sc);
		int[][][] con = new int[4][3][10];
		for (int i = 0; i<n ; i++ ) {
			String line = br.readLine();
			String[] split = line.split(" ");
			int building = Integer.parseInt(split[0]);
			int floor = Integer.parseInt(split[1]);
			int rank = Integer.parseInt(split[2]);
			int mem = Integer.parseInt(split[3]);
			con[(building-1)][(floor-1)][(rank-1)] += mem;

		}
		for (int i = 0; i<4 ; i++ ) {
			for (int j = 0; j < 3  ;j++ ) {
				for (int k = 0; k < 10 ; k++ ) {
					if ( k == 9) {
						System.out.print(" " + con[i][j][k] +"\n");
					}else{

					System.out.print(" " +con[i][j][k]);
					}
				}
			}
			if (i < 3) {
			System.out.println("####################");
			}
		}
	}
}