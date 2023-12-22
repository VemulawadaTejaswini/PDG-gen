import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int T = stdIn.nextInt();
		
		int[] t = new int[n];
		
		for(int i = 0; i < n; i++) {
			t[i] = stdIn.nextInt();
		}
		
		long time = 0;
		
		for(int i = 0; i< n-1; i++) {
			if(t[i]+T <= t[i+1]) {
				time += T;
			}else {
				time += t[i+1]-t[i];
			}
			
			
			
		}
		
		time += T;
		
		System.out.println(time);
		
		
		
	}

}
