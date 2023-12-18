import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	//for team
	public static final int ID = 0;
	public static final int AC = 1;
	public static final int PE = 2;
	public static int[][] team;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doIt();
	}
	
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int p = sc.nextInt();
		int r = sc.nextInt();
		while(t + p + r != 0){
			team = new int[t][3];
			int[][] problem = new int[t][p];
			//initialize
			for(int i = 0; i < t; i++){
				team[i][ID] = i + 1;
				team[i][AC] = 0;
				team[i][PE] = 0;
				for(int j = 0; j < p; j++){
					problem[i][j] = 0;
				}
			}
			//start.
			for(int i = 0; i < r; i++){
				int tID = sc.nextInt() - 1;
				int pID = sc.nextInt() - 1;
				int time = sc.nextInt();
				String message = sc.next();
				//System.out.println("tID = " + tID + ", pID = " + pID + ", time = " + time + ", message = " + message);
				if(message.equals("CORRECT")){
					team[tID][AC] += 1;
					team[tID][PE] += time + problem[tID][pID] * 1200;
					//System.out.println("correct : team " + tID + ", pID = " + pID);
				}
				else{
					problem[tID][pID] += 1;
				}
			}
			//teamデータを使ってチームの順位を決める
			int[] rank = new int[t];
			for(int i = 0; i < t; i++){
				rank[i] = i;
			}
			for(int i = 0; i < t; i++){
				for(int j = t - 1; j >= i + 1; j--){
					if(compare(rank[j - 1],rank[j])){
						//ひっくり返す
						int tmp = rank[j];
						rank[j] = rank[j - 1];
						rank[j - 1] = tmp;
					}
				}
			}
			for(int i = 0; i < t; i++){
				int tmp = rank[i];
				System.out.println(team[tmp][ID] + " " + team[tmp][AC] + " " + team[tmp][PE]);
			}
			t = sc.nextInt();
			p = sc.nextInt();
			r = sc.nextInt();
		}
	}
	//id1の成績 < id2の成績ならtrue
	public static boolean compare(int id1, int id2){
		boolean bRet = false;
		if(team[id1][AC] < team[id2][AC]){
			bRet = true;
		}
		else if(team[id1][AC] == team[id2][AC]){
			if(team[id1][PE] > team[id2][PE]){
				bRet = true;
			}
			else if(team[id1][PE] == team[id2][PE]){
				if(team[id1][ID] > team[id2][ID]){
					bRet = true;
				}
			}	
		}
		return bRet;
	}
}