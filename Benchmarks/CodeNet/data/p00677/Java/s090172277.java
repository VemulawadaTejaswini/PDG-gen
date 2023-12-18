import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static int s;
	static int d;
	static int m;
	static Map<Integer,Kanmi> Fmap = new HashMap<>();
	public void solve(){
		Scanner scan = new Scanner(System.in);
		while(true/*scan.hasNextLine()*/){
			Main.s = scan.nextInt();
			Main.d = scan.nextInt();
			Main.m = scan.nextInt();
			ArrayList<Kanmi> list = new ArrayList<>();
			for(int i = 0;i < Main.s;i++){
				ArrayList<Integer[]> wp = new ArrayList<>();
				int k = scan.nextInt();
				for(int j = 0;j < k;j++){
					wp.add(new Integer[]{scan.nextInt(),scan.nextInt()});
				}
				list.add(new Kanmi(k,wp));
			}
			Main.Fmap.clear();
			Main.dp.clear();
			for(int i = 0;i < Main.d;i++){
				Main.Fmap.put(i,list.get(scan.nextInt()));
				Main.dp.put(i,new HashMap<>());
			}
			int[] ans = Main.rec(0,Main.m, 0);
			System.out.println(ans[1] + " " + (Main.m - ans[0]));
			//scan.next();
		}
		//scan.close();
	}
	public static void main(String[] args) {
		new Main().solve();
		System.exit(0);
	}
	static Map<Integer,Map<Integer,int[]>> dp = new HashMap<>();
	public static int[] rec(int day,int money,int weight){
		if(money < 0){
			return new int[]{Integer.MAX_VALUE,0};
		}
		if(day >= Main.d){
			return new int[]{money,weight};
		}
		if(Main.dp.get(day).containsKey(money)){
			return Main.dp.get(day).get(money);
		}
		int[] max = new int[]{Integer.MAX_VALUE,0};
		for(Integer[] e : Main.Fmap.get(day).wp){
			int[] r = Main.rec(day+1, money-e[1], weight+e[0]);
			if(max[1] <= r[1] && max[0] > r[0]){
				max = r;
			}
		}
		Main.dp.get(day).put(money, max);
		return max;
	}
	static class Kanmi{
		int k;
		ArrayList<Integer[]> wp;
		public Kanmi(int k,ArrayList<Integer[]> wp){
			this.k = k;
			this.wp = wp;
		}
	}
}