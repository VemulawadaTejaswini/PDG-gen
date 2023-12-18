import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args){ 
		Scanner cin = new Scanner(System.in);
		while(true){
			int N=cin.nextInt();
			int M=cin.nextInt();
			if(N+M==0){
				break;
			}
			int[] field = new int[N + 1000];
			for(int i = 1;i<=N;i++){
				field[i]=cin.nextInt();
			}
			int[] dice = new int[M];
			for(int i = 0;i<M;i++){
				dice[i]=cin.nextInt();
			}
			int now =  1;
			for(int i = 0;i<M;i++){
				now = now + dice[i] + field[now+dice[i]];
				//System.out.println(now);
				if(now >= N){
					System.out.println(i+1);
					break;
				}
			}
		}
	}

}