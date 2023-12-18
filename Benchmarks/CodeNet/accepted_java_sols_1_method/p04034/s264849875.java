import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int M = scan.nextInt();

			int[]x = new int[M];
			int[]y = new int[M];

			int[]hako = new int[N];
			Arrays.fill(hako, 1);
			boolean[]red = new boolean[N];
			red[0] = true;

			for(int i = 0;i<M;i++) {
				x[i] = scan.nextInt()-1;
				y[i] = scan.nextInt()-1;

				hako[x[i]]--;
				hako[y[i]]++;

				if(red[x[i]]==true&& red[y[i]]==false) {
					red[y[i]] = true;
				}

				if(hako[x[i]]==0)red[x[i]]=false;


			}

			int count = 0;
			for(int i = 0;i<N;i++) {
				if(red[i])count++;
			}

			System.out.println(count);










		}


	}


}
