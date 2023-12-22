import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int teamnum = sc.nextInt(); //チーム数
		int teamscore[] = new int[teamnum+1];//勝ち点収納用配列
		for(int i=0;i<teamnum*(teamnum-1)/2;i++){ //試合数繰り返す。
			int team1=sc.nextInt();
			int team2=sc.nextInt();
			int score1=sc.nextInt();
			int score2=sc.nextInt();
				if(score1>score2){
					teamscore[team1] += 3;
				}
				else if(score1<score2){
					teamscore[team2] += 3;
				}
				else{
					teamscore[team1] += 1;
					teamscore[team2] += 1;
				}
		}
		for(int i=1;i<=teamnum;i++){
			int count=1;
			for(int j=1;j<=teamnum;j++){
				if(teamscore[i]<teamscore[j]){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}