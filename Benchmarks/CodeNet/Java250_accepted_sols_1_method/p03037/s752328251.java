import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int M = scan.nextInt();
			int[]L = new int[M];
			int[]R = new int[M];
			
			for(int i = 0;i<M;i++) {
				L[i] = scan.nextInt();
				R[i] = scan.nextInt();
			}
			
			int left = 1;
			int right = N;
			
			for(int i =0;i<M;i++) {
				if(left<L[i]) {
					left = L[i];
				}
				
				if(right>R[i]) {
					right = R[i];
				}
				
				
			}
			
			
			System.out.println(right-left>=0?right-left+1:0);
			
			
			
			
		}
		
		
	}
		

}
