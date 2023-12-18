import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args){
		// input
		Scanner inData = new Scanner(System.in);
		int N = Integer.parseInt(inData.nextLine());
		String[] A = inData.nextLine().split(" ");
		int K = Integer.parseInt(inData.nextLine());

		int cnt = 0;
		while (inData.hasNext()) {

			// B Cの入力受付
			StringTokenizer line = new StringTokenizer(inData.nextLine());
			String b = line.nextToken();
			String c = line.nextToken();

			int ans = 0;
			for (int i = 0; i < A.length; i++) {
				if (b.equals(A[i])) A[i] = c;
				ans += Integer.parseInt(A[i]);
			}

			System.out.println(ans);
			cnt++;
			if (cnt == K) break;
		}

		inData.close();
	}
}
