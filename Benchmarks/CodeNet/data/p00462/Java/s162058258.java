import java.util.Arrays;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while(true){
			int d = sc.nextInt();

			if(d == 0){
				break;
			}

			int n = sc.nextInt();
			int m = sc.nextInt();

			int[] store = new int [n + 1];
			store[n] = d;
			for(int i = 1; i < n; i++){
				store[i] = sc.nextInt();
			}

			int[] deliv = new int[m];
			for(int i = 0; i < m; i++){
				deliv[i] = sc.nextInt();
			}

			System.out.println(solve(store, deliv, d));
		}
	}
	
	static int solve(int[] store, int[] deliv, int d){
		int result = 0;

		Arrays.sort(store);

		for(int i = 0; i < deliv.length; i++){
			int index = Arrays.binarySearch(store, deliv[i]);

			//ちょうど店と同じ座標
			if(index >= 0){
				continue;
			}

			else {
				index++;
				index *= -1;

				result += Math.min(deliv[i] - store[index - 1], store[index] - deliv[i]);
			}
		}

		return result;
	}
}

