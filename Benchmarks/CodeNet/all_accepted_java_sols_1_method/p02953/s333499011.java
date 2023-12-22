import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		long max = 0;
		
		long[]h = new long[n];
		
		for(int i = 0; i < n; i++) {
			h[i] = stdIn.nextLong();
		}
		
		boolean flag = false;
		
		for(int i = 0; i < n-1; i++) {
			max = Math.max(max, h[i]);
			
			if(h[i] > h[i+1]) {
				if(h[i]-1 > h[i+1] || h[i]-1 != max - 1) {
					flag = true;
				}
			}
		}
		
		if(flag) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		
				
	}

}
