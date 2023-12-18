import java.util.*;
class Station{
	int from, to, cost, time;
}
class Answer{
	int from, to, costOrTime;
}
public class Main {
	/**
	 * @param n üHÌ{ E
	 * @param m wÌÂ V
	 * @param cost li
	 * @param time Ô
	 * @param numberOfAnswer NGÌ
	 **/
	static Scanner sc = new Scanner(System.in);
	static int n, m, cost, time, numberOfAnswer;
	static final int INF = 10000;
	static Station []st;
	static Answer []ans;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}

	//¸_ÌÔÍP©çÅ é±ÆÉÓI
	static boolean read(){
		n = sc.nextInt(); m = sc.nextInt();
		if(n == 0 && m == 0)
			return false;
		st = new Station[2*n+1];
		for(int i = 1; i < n+1; i++){
			st[i] = new Station();
			st[i].from = sc.nextInt();
			st[i].to = sc.nextInt();
			st[i].cost = sc.nextInt();
			st[i].time = sc.nextInt();
		}
		for(int i = n+1; i < 2*n+ 1; i++){
			st[i] = new Station();
			st[i].from = st[i - n].to;
			st[i].to = st[i - n].from;
			st[i].cost = st[i - n].cost;
			st[i].time = st[i - n].time;
		}
		numberOfAnswer = sc.nextInt();
		ans = new Answer[numberOfAnswer + 1];
		for(int j = 1; j < numberOfAnswer+1; j++){
			ans[j] = new Answer();
			ans[j].from = sc.nextInt();
			ans[j].to = sc.nextInt();
			ans[j].costOrTime = sc.nextInt();
		}
		return true;
	}
	static void solve(){
		for(int i = 1; i < numberOfAnswer+1; i++){
			if(ans[i].costOrTime == 1){
				shortestTime(ans[i].from, ans[i].to);
			}else{
				cheapestCost(ans[i].from, ans[i].to);
			}
		}
	}
	static void shortestTime(int from, int to){
		int []d = new int[m+1];
		for(int i = 1; i < m+1; i++)
			d[i] = INF;
		d[from] = 0;
		while(true){
			boolean update = false;
			for(int i = 1; i < 2*n+1; i++){
				Station station = st[i];
				if(d[station.from] != INF && d[station.to] > d[station.from] + station.time){
					d[station.to] = d[station.from] + station.time;
					update = true;
				}
			}
			if(!update) break;
		}
		System.out.println(d[to]);
	}
	static void cheapestCost(int from, int to){
		int []d = new int[m+1];
		for(int i = 1; i < m+1; i++)
			d[i] = INF;
		d[from] = 0;
		while(true){
			boolean update = false;
			for(int i = 1; i < 2*n+1; i++){
				Station station = st[i];
				if(d[station.from] != INF && d[station.to] > d[station.from] + station.cost){
					d[station.to] = d[station.from] + station.cost;
					update = true;
				}
			}
			if(!update) break;
		}
		System.out.println(d[to]);
	}
}