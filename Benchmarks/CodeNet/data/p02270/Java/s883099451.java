import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	private int n,k,min,max;
	private int[] W;

	private void mainrun() {
		scan = new Scanner(System.in);

		n = scan.nextInt();
		k = scan.nextInt();

		min = 0;
		max = Integer.MAX_VALUE;

		W = new int[n];

		for(int i = 0;i < n;i++) {
			int w = scan.nextInt();

			W[i] = w;
			min = Math.max(min, w - 1);
		}

		max -= min;
		
		while(true) {
			if(max > min + 1) {
				int mid = ( max + min ) / 2;

				int K = k - 1;
				int state = 0;

				for(int w : W) {
					if(state + w > mid) {
						state = w;
						K--;
					}else {
						state += w;
					}
				}
				if(K >= 0) {
					max = mid;
				}else {
					min = mid;
				}
			}else{
				System.out.println(min + 1);
				break;
			}
		}

	}
}
