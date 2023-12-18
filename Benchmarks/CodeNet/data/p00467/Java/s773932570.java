

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	/**
	 * ??\?????????????????? / ????????????????????????
	 */
	public static void main(String[] args) throws Exception {

		// ??\???????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (;;) {
			String[] readGame = br.readLine().split(" ");
			int sugorokuNum = Integer.parseInt(readGame[0]);
			int saikoroCnt = Integer.parseInt(readGame[1]);
			int[] sugorokuMasu = new int[sugorokuNum];
			
			if (sugorokuNum == 0) {
				break;
			}
			
			for (int i = 0; i < sugorokuNum; i++) {
				int factorCount = Integer.parseInt(br.readLine());
				sugorokuMasu[i] = factorCount;
			}
			
			int cnt = 0;
			int position = 0;
			
			for (int i = 0; i < saikoroCnt; i++) {
				int factorCount = Integer.parseInt(br.readLine());
				cnt++;
				if (position + factorCount > sugorokuNum - 1) {
					break;
				} else {
					position += factorCount + sugorokuMasu[position + factorCount]; 
				}
			}
			
			for (int i = 0; i < saikoroCnt - cnt; i++) {
				br.readLine();
			}
			
			System.out.println("test");
		}
	}
}