import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		int n = Integer.parseInt(input);

		String[] tmpArray = br.readLine().split(" ");

		long originalCost = 0;
		int position[] = new int[n + 2];

//		long dp[] = new long[n + 1];
//		int maxX = Integer.MIN_VALUE;
//		int minX = Integer.MAX_VALUE;

//		int[] sortArray = new int[n];
		for(int i = 0; i < n; i++){
			position[i + 1] = Integer.parseInt(tmpArray[i]);
			originalCost += Math.abs(position[i + 1] - position[i]);

//			if(i == 0){
//				dp[i] = Math.abs( position[i]);
//			}
//			else {
//				dp[i] = dp[i - 1] + Math.abs(position[i] - position[i - 1]);
//			}
//			sortArray[i] = position[i];

//			maxX = Math.max(maxX, position[i]);
//			minX = Math.min(minX, position[i]);
		}
		
		originalCost += Math.abs(position[n]);

//		dp[n] = dp[n - 1] + Math.abs(position[n - 1]);

//		Arrays.sort(sortArray);
//		if(sortArray[0] < 0){
//			originalCost += -2*sortArray[0];
//			System.out.println("origin "+originalCost);
//		}
//		if(sortArray[n - 1] > 0){
//			originalCost += 2*sortArray[n - 1];
//			System.out.println("origin "+originalCost);
//		}
//		originalCost = Math.abs(position[0]);
//		System.out.println("origin "+originalCost);
//		for(int i = 1; i < n; i++){
//			originalCost += Math.abs(position[i] - position[i - 1]);
//			System.out.println("origin "+originalCost);
//		}
//		originalCost += Math.abs(position[n - 1]);
//
//		System.out.println("origin "+originalCost);

		for(int i = 1; i <= n; i++){
			long result = originalCost;
			
			int dist1 = position[i] - position[i - 1];
			int dist2 = position[i + 1] - position[i];
//			System.out.println("dist1 "+dist1+" dist2 "+dist2);
			
			//i番目がピークになる場合
			if(dist1 * dist2 < 0){
//				System.out.println("update");
				result -= Math.abs(dist1) + Math.abs(dist2);
				result += Math.abs(position[i + 1] - position[i - 1]);
			}
			
			System.out.println(result);
		}


	}

}
