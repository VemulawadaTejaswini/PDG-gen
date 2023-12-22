import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		if(N == 1){
			System.out.println(1);
			sc.close();
			return;
		}

		Integer[] d = new Integer[N];

		for(int i = 0; i < d.length; i++){
			d[i] = sc.nextInt();
		}

		sc.close();

		Arrays.sort(d, Collections.reverseOrder());

		int c = d[0];
		int ans = 1;
		
		for(int i = 1; i < d.length; i++){
			if(d[i] < c){
				c = d[i];
				ans++;
			}
		}

		System.out.println(ans++);
	}
}
