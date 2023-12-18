import java.util.Scanner;

public class Main {	
	
	// JAG Team Coding Source (一部改訂)
	
	static class Team {
		int id;
		int slove;
		boolean flag[];
		int pena[];
		int time;
		Team(int nid,int P){
			this.id = nid;
			this.slove = 0;
			this.flag = new boolean[P+1];
			this.pena = new int[P+1];
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int t = sc.nextInt();
			int p = sc.nextInt();
			int r = sc.nextInt();
			if((t|p|r)==0){
				break;
			}
			Team[] team = new Team[t+1];		// チーム配列の生成
			for(int i=0;i<=t;i++){
				team[i] = new Team(i,p);		// チーム配列でチームクラス生成
			}
			for(int i=0;i<r;i++){		// Main Input
				int tid = sc.nextInt();
				int pid = sc.nextInt();
				int ttime = sc.nextInt();
				String str = sc.next();			// message
				if(str.equals("CORRECT")){
					if(!(team[tid].flag[pid])){		// 1st AC
						team[tid].slove++;
						team[tid].time += team[tid].pena[pid]*1200+ttime;
						team[tid].flag[pid] = true;
					}
				}
				else{
					team[tid].pena[pid]++;
				}
			}
			// Sorting (最小値選択ソート)
			for(int i=1;i<=t;i++){
				int max = i;
				for(int j=i;j<=t;j++){
					if(team[max].slove<team[j].slove){		// より問題を解いた
						max=j;
					}
					else if(team[max].slove==team[j].slove){
						if(team[max].time>team[j].time){	// ペナルティ
							max=j;
						}
						else if(team[max].time==team[j].time){
							if(team[max].id>team[j].id){	// チームIDの若い
								max=j;
							}
						}
					}
				}
				// Swap
				Team temp = team[i];
				team[i] = team[max];
				team[max] = temp;
			}
			// Output
			for(int i=1;i<=t;i++){
				System.out.println(team[i].id+" "+team[i].slove+" "+team[i].time);
			}
		}
	}
}