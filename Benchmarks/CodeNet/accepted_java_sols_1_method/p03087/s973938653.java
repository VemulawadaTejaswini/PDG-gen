import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int Q = reader.nextInt();
		String S = reader.next();
		int[] arr = new int[N];
		int[] beginIndex =  new int[Q];
		int[] endIndex =  new int[Q];
		for (int i = 0; i < Q; i++) {
			beginIndex[i] = reader.nextInt() - 1;
			endIndex[i] = reader.nextInt() - 1;
		}

		for (int i = 0; i < N - 1; i++) {
			arr[i+1] = arr[i];
			String tmp = S.substring(i, i+2);
			if (tmp.equals("AC")) {
				arr[i+1]++;
				if (i < N -2) {
					arr[i+2]  = arr[i+1];
					i++;
				}
			}
		}
		for (int i = 0; i < Q; i++) {
			int a = arr[endIndex[i]] - arr[beginIndex[i]];
			int ans = Math.max(a, 0);
			System.out.println(ans);
		}
		reader.close();
	}
}



