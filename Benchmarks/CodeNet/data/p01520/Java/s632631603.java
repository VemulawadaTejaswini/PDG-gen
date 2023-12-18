import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		final int T = sc.nextInt();
		final int E = sc.nextInt();
		
		int suc = -1;
		
		for(int i = 0; i < N; i++){
			final int TIMER = sc.nextInt();
			
			for(int j = 0; j <= T + E; j += TIMER){
				if(j >= T - E){
					suc = i + 1;
					break;
				}
			}
		}
		
		System.out.println(suc);
	}

}