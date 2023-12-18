import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;

		// エラトステネスの篩
		int MAX = 1000000;
		int num = (MAX - 3) / 2;
		int[] prime = new int[MAX + 1];
		int count = 1;
		int[] total = new int[10000 + 1];
		total[1] = 2;

		for (int i = 0; i < num; i++) {
			if (prime[i] == 0) {
				int primeNum = i + i + 3;
				count++;
				total[count] = total[count - 1] + primeNum;
				for (int j = i + primeNum; j <= MAX; j += primeNum)
					prime[j] = 1;
				if(count == 10000) break;
			}
		}
		
		try {
			while ((line = br.readLine()) != null) {
				line = line.trim();
				if (line.equals("0"))
					break;
				int N = Integer.parseInt(line);
				
				System.out.println(total[N]);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}