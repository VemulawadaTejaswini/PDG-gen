import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] vote = new String[N];
		int i = 0;
		while(i < N) {
			vote[i] = sc.next();

			i++;
		}

		Arrays.sort(vote);
		int maxCounter = 0;
		int[] a = new int[N];
		String[] b = new String[N];
		int j = 0;

		a[0] = 1;
		b[0] = vote[0];

		for(i = 1; i < N; i++) {
			if(vote[i].equals(b[j])) {
				a[j]++;
			}else {
				if(maxCounter < a[j]) {
					maxCounter = a[j];
				}
				j++;
				a[j] = 1;
				b[j] = vote[i];
			}
		}
		if(maxCounter < a[j]) {
			maxCounter = a[j];
		}

		for(i = 0; i<N; i++) {
			if(a[i] == maxCounter) {
				System.out.println(b[i]);
			}
		}

	}

}
