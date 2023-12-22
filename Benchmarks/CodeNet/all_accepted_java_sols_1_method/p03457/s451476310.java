	import java.util.*;
	
	
	
	public class Main {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int preT = 0;
			int preX = 0;
			int preY = 0;
			
			for (int i=0;i<N;i++) {
				int proT = sc.nextInt();
				int proX = sc.nextInt();
				int proY = sc.nextInt();
				
				int T = proT -preT;
				int goX = proX-preX;
				int goY = proY-preY;
				
				if((goX+goY)>T || (T-goX-goY)%2 !=0) {
					System.out.println("No");
					return;
				}	
			}
			
			System.out.println("Yes");
			
			sc.close();
			
		}
		
		
	}