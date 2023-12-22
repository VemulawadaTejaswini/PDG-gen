//B
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int snk[] = new int[n];
		for (int i = 0; i < n; i++) {
			snk[i] = 0;
		}
		
		for (int i = 0; i < k; i++) {
			int d = sc.nextInt();
			for (int j = 0; j < d; j++) {
				int a_id = sc.nextInt();
				snk[a_id - 1] = 1;
			}
		}
		
		int count = 0;
		for (int l = 0; l < n; l++) {
			if (snk[l] == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}