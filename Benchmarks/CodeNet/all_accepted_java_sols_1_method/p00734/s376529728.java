import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String[] tmpArray = br.readLine().split(" ");

			int n = Integer.parseInt(tmpArray[0]);
			int m = Integer.parseInt(tmpArray[1]);

			if(n == 0 && m == 0){
				break;
			}

			int[] taro = new int[n];
			int[] hanako = new int[m];
			int sumT = 0;
			int sumH = 0;

			for(int i = 0; i < n; i++){
				taro[i] = Integer.parseInt(br.readLine());
				sumT += taro[i];
			}

			for(int i = 0; i < m; i++){
				hanako[i] = Integer.parseInt(br.readLine());
				sumH += hanako[i];
			}

			int minSumI = -1;
			int minSumJ = -1;
			int minSum = Integer.MAX_VALUE;

			for(int i = 0; i < n; i++){
				for(int j = 0; j < m; j++){
					if(sumT - taro[i] + hanako[j] == sumH - hanako[j] + taro[i] && sumT - taro[i] + hanako[j] < minSum){
						minSum = sumT - taro[i] + hanako[j];
						minSumI = i;
						minSumJ = j;
					}
				}
			}
			
			if(minSumI >= 0 && minSumJ >= 0){
				System.out.println(taro[minSumI] + " " + hanako[minSumJ]);
			}
			else {
				System.out.println(-1);
			}

		}
	}

}