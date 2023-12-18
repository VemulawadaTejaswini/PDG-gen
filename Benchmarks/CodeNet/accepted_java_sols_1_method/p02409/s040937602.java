import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int[][][] map = new int[4][3][10];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 10; k++) {
					map[i][j][k] = 0;
				}
			}
		}
		
		String x = "";
		try {
			x = in.readLine();
			int num = Integer.parseInt(x);
			
			for (int i = 0; i < num; i++) {
				x = in.readLine();
				String[] data = x.split(" ");
				int b = (Integer.parseInt(data[0]) - 1);
				int f = (Integer.parseInt(data[1]) - 1);
				int r = (Integer.parseInt(data[2]) - 1);
				int v = Integer.parseInt(data[3]);
				
				map[b][f][r] = map[b][f][r] + v;
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 10; k++) {
					System.out.print(" " + map[i][j][k]);
				}
				System.out.println();
			}
			if (i != 3) {
				System.out.println("####################");
			}
		}
	}
}