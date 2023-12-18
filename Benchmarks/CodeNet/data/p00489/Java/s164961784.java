import java.util.*;
class   Team{   
	int     teamnum;   
    int     teampoint;   
    public Team(int v1, int v2)
    {   teamnum= v1;
        teampoint= v2;
    }
}
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		Team [] team = new Team [num + 1];
		int teamrank[] = new int [num + 1];
		for(int i = 1; i < num + 1; i++){
			teamrank[i] = 1;
		}
		for(int i = 1; i < num + 1; i++){
			team[i] = new Team(i, 0);
		}
		for(int i = 0; i < num * (num - 1) / 2; i++){
			int team1 = in.nextInt();
			int team2 = in.nextInt();
			int point1 = in.nextInt();
			int point2 = in.nextInt();
			if(point1 < point2){
				team[team1].teampoint += 0;
				team[team2].teampoint += 3;
			}
			else if(point1 == point2){
				team[team1].teampoint += 1;
				team[team2].teampoint += 1;
			}
			else {
				team[team1].teampoint += 3;
				team[team2].teampoint += 0;
			}
		}
		for(int i = 1; i <= num; i++){
			for(int k = i + 1;k <= num; k++){
				if(team[i].teampoint < team[k].teampoint){
					teamrank[i]++;
				}
				else if(team[i].teampoint > team[k].teampoint){
					teamrank[k]++;
				}
			}
			System.out.println(teamrank[i]);
		}
	}
}