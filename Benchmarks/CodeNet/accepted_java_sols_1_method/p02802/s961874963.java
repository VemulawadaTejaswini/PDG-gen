import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int ac = 0;
		int[] wa = new int[N];

		boolean[] result = new boolean[N];
		for (int i = 0; i < N; i++) {
			result[i] = false;
		}
		if (M == 0) {

		} else {
			for (int i = 0; i < M; i++) {
				int p = sc.nextInt();
				String S = sc.next();

				if (S.equals("AC")) {
					if (result[p - 1] == false) {
						result[p - 1] = true;
						ac++;
					}
				} else {
					if (result[p - 1] == false) {
						wa[p-1]++;
					}
				}
			}
		}
		int WA = 0;
		for(int i=0;i<N;i++) {
			if(result[i]==true) {
				WA += wa[i];
			}
		}
		System.out.println(ac + " " + WA);

	}
}
