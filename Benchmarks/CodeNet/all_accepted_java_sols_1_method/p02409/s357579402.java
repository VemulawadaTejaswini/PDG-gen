import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		int[][][] buildingInfo = new int [4][3][10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int i =0; i < n; i++) {
			String[] line = br.readLine().split(" ");
			int building = Integer.parseInt(line[0]);
			int floor = Integer.parseInt(line[1]);
			int room = Integer.parseInt(line[2]);
			int v = Integer.parseInt(line[3]);
			buildingInfo[building - 1][floor - 1][room - 1] += v;
		}

		String blank = " ";
		for (int i = 0; i< buildingInfo.length; i++) {
			for (int j = 0; j < buildingInfo[0].length; j++) {
				for (int k = 0; k < buildingInfo[0][0].length; k++) {
					System.out.print(blank + buildingInfo[i][j][k]);
				}
				System.out.println("");
			}
			if (i != buildingInfo.length - 1) {
				System.out.println("####################");
			}
		}
	}
}