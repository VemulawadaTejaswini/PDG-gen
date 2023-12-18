import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		int numberS = Integer.parseInt(br.readLine());

		String[] progressionS = br.readLine().split(" ");

		int[] progressionSInteger = new int[numberS];

		for (int i = 0; i < numberS; i++) {
            progressionSInteger[i] = Integer.parseInt(progressionS[i]);
		}

		int numberT = Integer.parseInt(br.readLine());

		String[] progressionT = br.readLine().split(" ");

		int[] progressionTInteger = new int[numberT];

		for (int i = 0; i < numberT; i++) {
			progressionTInteger[i] = Integer.parseInt(progressionT[i]);
		}

		int equalCount = 0;
		for(int i = 0; i < numberT; i++) {
			for(int j = 0; j < numberS; j++) {
				if(progressionTInteger[i] == progressionSInteger[j]) {
					equalCount++;
					break;
				}
			}
		}
		System.out.println(equalCount);
	}
}