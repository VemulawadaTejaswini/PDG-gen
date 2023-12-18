import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 0;
		int[][] ar = new int[2][];
		
		for(int i = 0; i < 2; i++ ){

			n = sc.nextInt();
			ar[i] = new int[n];

			for(int j = 0;j < n;j++){
				ar[i][j] = sc.nextInt();
			}
		}

		for (int[] a : ar) {
			Arrays.sort(a);
		}

		int cnt = 0;
		for (int i = 0; i < ar[1].length; i++) {
			if (Arrays.binarySearch(ar[0], ar[1][i]) >= 0){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}