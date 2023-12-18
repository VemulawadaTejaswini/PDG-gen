import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt(); //モンスターの数
		int k = stdIn.nextInt(); //必殺技の回数
		
		long cnt = 0;
		
		int[] h = new int[n];
		
		
		
		for(int i = 0; i < n; i++) {
			h[i] = stdIn.nextInt();
		}

		if(n <= k) {
			System.out.println(0);
		}else {
			Arrays.sort(h);
			for(int i = 0; i < n-k; i++) {
				cnt += h[i];
			}
			System.out.println(cnt);
		}



	}

}
