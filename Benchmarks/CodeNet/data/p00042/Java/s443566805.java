import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		int count = 0;
		while (true) {
			line = br.readLine().trim();
			if (line.equals("0"))
				break;
			count++;

			int W = Integer.parseInt(line);
			int N = Integer.parseInt(br.readLine().trim());
			int[][] treaser = new int[2][N];
			for (int i = 0; i < N; i++) {
				line = br.readLine();
				String[] splited = line.trim().split(",");
				treaser[0][i] = Integer.parseInt(splited[0]);
				treaser[1][i] = Integer.parseInt(splited[1]);
			}
			
			searchBestChoice(treaser, N, W, count);
		}
	}

	private static void searchBestChoice(final int[][] treaser, final int N, final int w, int count) {
		int maxValue = -1;
		int maxWeight = w * 2;
		
		for(int i = 0; i < 1 << N; i++) {
			int sumWeight = 0;
			int sumValue = 0;
			
			for(int j = 0; j < N; j++) {
				if((i >> j & 1) == 1) {
					sumWeight += treaser[1][j];
					sumValue += treaser[0][j];
				}
			}
			if(sumWeight <= w) {
				if(maxValue < sumValue) {
					maxValue = sumValue;
					maxWeight = sumWeight;
				} else if(maxValue == sumValue) {
					maxWeight = Math.min(maxWeight, sumWeight);
				}
			}
		}
		
		System.out.println("Case " + count + ":");
		System.out.println(maxValue);
		System.out.println(maxWeight);
	}
}