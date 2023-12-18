import java.util.Scanner;
	
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int rc = i * (i - 1) / 2;
		int ten[] = new int[i];
		for(int j = 0; j < i; j++){
			ten[j] = 0;
		}
		for(int j = 0; j < rc; j++){
			int team1 = sc.nextInt();
			int team2 = sc.nextInt();
			int score1 = sc.nextInt();
			int score2 = sc.nextInt();
			if(score1 > score2){
				ten[team1-1] = ten[team1-1] + 3;
			}else if(score1 < score2){
				ten[team2-1] = ten[team2-1] + 3;
			}else if(score1 == score2){
				ten[team1-1] = ten[team1-1] + 1;
				ten[team2-1] = ten[team2-1] + 1;
			}
		}
		for(int j = 0; j < i; j++){
			int rank = i;
			for(int k = 0; k < i; k++){
				if(j == k){
					continue;
				}else if(ten[j] >= ten[k]){
					rank = rank - 1;
				}
			}
			System.out.println(rank);
		}
	}
}