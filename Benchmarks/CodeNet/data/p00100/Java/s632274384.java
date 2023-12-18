import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			int n = Integer.parseInt(br.readLine());

			if(n == 0) break;

			int[][] data = new int[1000][4];
			//?????????????????????
			for(int i = 0; i < data.length ; i++){
				for(int j = 0; j < data[i].length; j++){
					data[i][j] = 0;
				}
			}

			//?????????????????????
			for(int i = 0; i < n ; i++){
				String[] tmpArray = br.readLine().split(" ");

				//int ID = Integer.parseInt(tmpArray[0]);
				for(int j = 0; j < 3; j++){

					data[i][j] = Integer.parseInt(tmpArray[j]);
				}
			}

			//?????????????¨?
			int[] result = new int[4001];

			for(int i = 0; i < result.length ; i++){
				result[i] = 0;
			}

			for(int i = 0; i < n; i++){
				int remain = 1000000 - result[data[i][0]];

				if(remain <= 0){
					continue;
				}

				if(data[i][1] == 0){
					continue;
				}
				int require = remain / data[i][1] + 1;

				if(data[i][2] >= require){
					result[data[i][0]] = 1000000;
				}
				else{
					result[data[i][0]] += data[i][1]*data[i][2];
				}
			}

			//????????????
			int count = 0;
			for(int i = 1; i < result.length; i++){
				if(result[i] >= 1000000){
					//System.out.println(i + "result "+result[i]);
					System.out.println(i);
					count++;
				}
			}

			if(count == 0){
				System.out.println("NA");
			}
		}
	}

}