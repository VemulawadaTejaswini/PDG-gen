import java.util.*;
public class Main {
	final int INF = 1 << 24;
	final int MAXDIS = 100000;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int c = sc.nextInt();
			int s = sc.nextInt();
			int g = sc.nextInt();
			if((n|m|c|s|g) == 0) break;
			s--;
			g--;
			int [][] mlist = new int[m][4];
			int [][][] dispass = new int [c][n][n];
			for(int i=0; i < c;i++){
				for(int j = 0; j < n; j++){
					Arrays.fill(dispass[i][j], INF);
					dispass[i][j][j] = 0;
				}
			}
			for(int i=0; i < m;i++){
				int from = sc.nextInt() -1;
				int to = sc.nextInt() - 1;
				int dis = sc.nextInt();
				int nowc = sc.nextInt() -1;
				mlist[i][0] = from;
				mlist[i][1] = to;
				mlist[i][2] = dis;
				mlist[i][3] = nowc;
				if(dispass[nowc][from][to] > dis){
					dispass[nowc][from][to] = dis;
					dispass[nowc][to][from] = dis;
				}
			}
			for(int cind = 0; cind < c; cind++){
				for(int j = 0; j < n; j++){
					for(int i = 0; i < n ; i++){
						for(int k = 0; k < n; k++){
							dispass[cind][i][k] = Math.min(dispass[cind][i][k], 
									dispass[cind][i][j] + dispass[cind][j][k]);
						}
					}
				}
			}
			
			int [] plist = new int[c];
			for(int i=0; i < c; i++){
				plist[i] = sc.nextInt();
			}
			ArrayList<ArrayList<Integer>> qlist = new ArrayList<ArrayList<Integer>>();
			ArrayList<ArrayList<Integer>> rlist = new ArrayList<ArrayList<Integer>>();
			for(int i=0; i < c; i++){
				qlist.add(new ArrayList<Integer>());
				qlist.get(i).add(0);
				rlist.add(new ArrayList<Integer>());
				for(int j = 0; j < plist[i] - 1; j++){
					qlist.get(i).add(sc.nextInt());
				}
				qlist.get(i).add(MAXDIS);
				for(int j = 0; j < plist[i]; j++){
					rlist.get(i).add(sc.nextInt());
				}
			}
			//create fare
			int [][] farelist = new int[c][MAXDIS + 1];
			for(int cInd=0; cInd < c;cInd++){
				ArrayList<Integer> nowq = qlist.get(cInd);
				for(int i = 1; i < nowq.size();i++){
					for(int j = nowq.get(i-1) + 1 ; j <= nowq.get(i); j++){
						farelist[cInd][j] = farelist[cInd][j-1] + rlist.get(cInd).get(i-1);
					}
				}
			}
			
			//create pass
			int [][] pass = new int[n][n];
			for(int i=0; i < c;i++){
				for(int j = 0; j< n; j++){
					Arrays.fill(pass[i], INF);
					pass[i][i] = 0;
				}
			}
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					int value = INF;
					for(int cind = 0; cind < c; cind++){
						int dis = dispass[cind][i][j];
						if(dis >= INF) continue;
						value = Math.min(value, farelist[cind][dis]);
					}
					pass[i][j] = value;
				}
			}
			
			//All pass
			int [][] allPass = new int[n][n];
			for(int i=0; i < n;i++){
				Arrays.fill(allPass[i], INF);
				allPass[i][i] = 0;
			}
			for(int j = 0; j < n; j++){
				for(int i = 0; i < n; i++){
					for(int k = 0; k < n; k++){
						allPass[i][k] = Math.min(allPass[i][k], pass[i][j] + pass[j][k]);
					}
				}
			}
			int ans = allPass[s][g] >= INF ? -1 : allPass[s][g];
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}