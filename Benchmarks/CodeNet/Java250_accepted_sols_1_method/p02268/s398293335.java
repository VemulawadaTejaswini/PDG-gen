import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		int numberS = Integer.parseInt(br.readLine());

		String[] progressionS = br.readLine().split(" ");

		int[] S = new int[numberS];

		for (int i = 0; i < numberS; i++) {
            S[i] = Integer.parseInt(progressionS[i]);
		}

		int numberT = Integer.parseInt(br.readLine());

		String[] progressionT = br.readLine().split(" ");

		int[] T = new int[numberT];

		for (int i = 0; i < numberT; i++) {
			T[i] = Integer.parseInt(progressionT[i]);
		}

		int equalCount = 0;
		for(int i = 0; i < numberT; i++) {

			int start = 0;
			int end = numberS - 1;

			while(start <= end) {
				int target = start + (end - start) / 2;

				if(T[i] == S[target]) {
					equalCount++;
					break;
				} else if(T[i] > S[target]) {
					start = target + 1;
				} else if(T[i] < S[target]) {
					end = target - 1;
				}
			}
		}
		System.out.println(equalCount);
	}
}