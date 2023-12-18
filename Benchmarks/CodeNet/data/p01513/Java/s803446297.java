import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int N = sc.nextInt();
				if(N == 0) break;
				
				boolean[][] jud = new boolean[101][101];
				for(int i=1; i<=N; i++) {
					int M = sc.nextInt();
					for(int j=1; j<=M; j++) {
						int num = sc.nextInt();
						jud[i][num] = true;
					}
				}
				
				int K = sc.nextInt();
				int[] k = new int[101];
				for(int i=1; i<=K; i++)
				{
					int l = sc.nextInt();
					for(int j=1; j<=N; j++) {
						if(jud[j][l]) k[j]++;
					}
				}
				
				int end = 0;
				int per = 0;
				for(int i=1; i<=N; i++) {
					if(k[i] == K) {
						end++;
						per = i;
					}
				}
				if(end == 1) System.out.println(per);
				else System.out.println(-1);
			}
		}
	}
}
