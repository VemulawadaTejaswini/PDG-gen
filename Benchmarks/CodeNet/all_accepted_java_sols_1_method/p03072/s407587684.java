import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int[] h = new int[n];
		
		for(int i = 0; i < n; i++) {
			h[i] = stdIn.nextInt();
		}
		
		int cnt = 1;
		int max = h[0];
		
		
		for(int i = 1; i < n; i++) {
			if(max <= h[i]) {
				cnt++;
				max = Math.max(max, h[i]);
			}
			
			
		}
		
		System.out.println(cnt);
		
	}

}
