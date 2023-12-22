import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();				//チーム数
		int games = n * (n - 1) / 2;		//試合数
		int teamA;
		int teamB;
		int teamAp;
		int teamBp;
		int winP[] = new int[n];
		for(int i = 0; i < n; i++){
			winP[i] = 0;
		}

		for(int i = 0; i < games; i++){
			teamA = sc.nextInt();
			teamB = sc.nextInt();
			teamAp = sc.nextInt();
			teamBp = sc.nextInt();

			if(teamAp > teamBp){
				winP[teamA-1] += 3;
			}else if(teamAp < teamBp){
				winP[teamB-1] += 3;
			}else{
				winP[teamA-1] += 1;
				winP[teamB-1] += 1;
			}
		}
		int rank[] = new int[n];
		for(int i = 0; i < n; i++){
			rank[i] = 1;
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(winP[i] < winP[j]){
					rank[i]++;
				}
			}
		}
		for(int i = 0; i < n; i++){
			System.out.println(rank[i]);
		}
	}
}