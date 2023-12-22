
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] town = new int[N+1];
		int[] hero = new int[N];
		int diff =0;
		for(int i =0;i<N+1;i++) {
			town[i] = scan.nextInt();
		}

		long count = 0;
		for(int i =0;i<N;i++) {
			hero[i] = scan.nextInt();
			if (town[i]<hero[i]) {
				count += town[i];
				hero[i] -= town[i];
				town[i] = 0;

				if(town[i+1]<hero[i]) {
					count += town[i+1];
					hero[i] -= town[i+1];
					town[i+1] = 0;
				} else {
					count += hero[i];
					town[i+1] -= hero[i];
					hero[i]=0;
				}
			} else {
				count += hero[i];
				town[i] -= hero[i];
				hero[i]=0;
			}
		}
		System.out.println(count);
		scan.close();
	}

}

