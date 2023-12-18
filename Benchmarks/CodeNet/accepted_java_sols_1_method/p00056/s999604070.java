import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;

		// エラトステネスの篩
		int MAX = 50000;
		int num = (MAX - 3) / 2;
		boolean[] prime = new boolean[MAX + 1];
		Arrays.fill(prime, true);
		int[] primeArray = new int[25000];
		int count = 1;
		primeArray[0] = 2;
		
		for (int i = 0; i < num; i++) {
			if (prime[i] == true) {
				int primeNum = i + i + 3;
				primeArray[count] = primeNum;
				count++;
				for (int j = i + primeNum; j <= MAX; j += primeNum)
					prime[j] = false;
			}
		}
		
		int[] ans = new int[50001]; 
		
		for (int i = 0; primeArray[i] >= 2; i++) {
			for (int j = i; primeArray[j] >= 2 && primeArray[i] + primeArray[j] <= MAX; j++) {
				ans[primeArray[i] + primeArray[j]]++;
			}
		}

		try {
			while ((line = br.readLine()) != null) {
				line = line.trim();
				if (line.equals("0"))
					break;

				int N = Integer.parseInt(line);

				System.out.println(ans[N]);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}