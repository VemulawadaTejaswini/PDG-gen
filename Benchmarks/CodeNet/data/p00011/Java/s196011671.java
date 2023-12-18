import java.util.Scanner;


public class Main {
	
	Scanner sc = new Scanner(System.in);
	
	void run() {
		
		int w = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] h = new int [n][2];
		
		String[] s;
		int[] ans = new int [w];
		
		for (int i=0;i<n;i++) {
			s = sc.next().split(",");
			
			h[i][0] = Integer.parseInt(s[0]);
			h[i][1] = Integer.parseInt(s[1]);
			
		}
		
		for (int i=1;i<=w;i++) {
			
			int state = i;
			
			for (int j=0;j<n;j++) {
				
				if ( h[j][0] == state )
					state = h[j][1];
				else if ( h[j][1] == state )
					state = h[j][0];	
				
				
			}
			ans[state-1] = i;
		}
		for (int i=0;i<w;i++) {
			System.out.println(ans[i]);
		}
		
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}