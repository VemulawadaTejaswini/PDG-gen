	import java.util.*;
	
	
	
	public class Main {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int Y = sc.nextInt();
			int x = 0;
			int y = 0;
			int z = 0;
			
			for(int i = 0;i<=N;i++) {
				x = i;
				for (int j=0;j<=(N-i);j++) {
					y = j;
					z = N-i-j;
					if (Y == 10000*x + 5000*y + 1000*z) {
						System.out.println(x+" "+y+" "+z);
						return;
					}
				}
			}
			
			System.out.println("-1 -1 -1");
			
			sc.close();
			
		}
		
		
	}