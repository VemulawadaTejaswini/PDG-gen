import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	int max = 1000000;

	boolean[] Prime = new boolean[max];
	private void mainrun() {
		scan = new Scanner(System.in);
		Arrays.fill(Prime, true);

		Prime[0] = Prime[1] = false;
		for(int i = 2;i < Math.sqrt(max);i++) {
			if(Prime[i]) {
				for(int j = i * 2;j < max;j += i) {
					Prime[j] = false;
				}
			}
		}

		while(scan.hasNext()) {
			int N = scan.nextInt();
			int Ans = 0;

			for(int i = 2;i <= N;i ++) {
				if(Prime[i]) {Ans++;}
			}
			System.out.println(Ans);
		}

	}
}
