import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		/**
		 * ?????°,???????????£?¨?
		 */
		int x = 0, n = 0; // ??\????????°
		int count = 0;
		ArrayList<Integer> answer = new ArrayList<Integer>();
		String tmpbox[] = new String[2];

				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/**
		 * ??°????§£?????????
		 */
		while (true) {
			String str = br.readLine();
			tmpbox = str.split(" ");
			n = Integer.parseInt(tmpbox[0]);
			x = Integer.parseInt(tmpbox[1]);

			if (n == 0 && x == 0) { // x,n??±???0????????????
				break;
			}
			if(n < 3 || n > 100){
				System.exit(0);
			}

			for (int i = 1; i <= n-2; ++i) {
				for (int j = i+1; j <= n-1; ++j) {
					for (int k = j+1; k <= n; ++k) {
						if  (i+j+k == x) {
							++count;
						}
					}
				}
			}
			answer.add(count); // ???????????¢??¨????????????????????°????´???????
			count = 0;
		}
		int answer_length = answer.size();
		for(int t = 0; t < answer_length; ++t){
			System.out.println(answer.get(t));
		}
	}

}