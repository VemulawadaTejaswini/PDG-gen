import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			int N, L;
			N = Integer.parseInt(sc.next());
			L = Integer.parseInt(sc.next());
			int[] aji = new int[N];

			int sum = 0;
			for (int i = 0; i < N; i++) {
				aji[i] = L + i;
				sum += aji[i];
			}
			
			int difMin = Integer.MAX_VALUE;
			int ans = 0;
			
			for (int i = 0; i < N; i++) {
				
				int dif = Math.abs(sum - (sum - aji[i]) );
				
				if (difMin > dif) {
					ans = sum - aji[i];
					difMin = dif;
				}
			}
			
			System.out.println(ans);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
