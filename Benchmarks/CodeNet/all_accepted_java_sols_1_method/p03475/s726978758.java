import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[]C = new int[N];
			int[]S = new int[N];
			int[]F = new int[N];
			
			for(int i  = 0;i<N-1;i++) {
				C[i] = scan.nextInt();
				S[i] = scan.nextInt();
				F[i] = scan.nextInt();
			}
			
			for(int i = 0;i<N-1;i++) {
				int time = 0;
				time+=S[i];
				time+=C[i];
				for(int j = i+1;j<N-1;j++) {
					if(S[j]<=time) {
						if((time-S[j])%F[j]==0) {
							time+=C[j];
						}else {
							int s = F[j]-(time-S[j])%F[j];
							time+=s;
							time+=C[j];
						}
					}else {
						time = S[j];
						time+=C[j];
					}
				}
				
				System.out.println(time);
				
				
			}
			
			System.out.println(0);
			
		}
		
		
	}
		

}
