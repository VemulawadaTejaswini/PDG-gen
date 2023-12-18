import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		name = new int[n];
		x = new int[n];
		w = new int[n];

		for(int i=0;i<n;i++){
			name[i] = sc.nextInt();
			x[i] = sc.nextInt();
			w[i] = sc.nextInt() * 20;
		}

		dp = new Res[n][1<<n];
		Res ans = new Res(Double.MAX_VALUE,new ArrayList<Integer>());
		for(int i=0;i<n;i++){
			Res tmp = solve(i,0,w[i]);
			if(ans.cost > tmp.cost){
				ans = tmp;
			}
		}

		System.out.println(ans.pass.toString().replaceAll("\\[|,|\\]",""));
	}

	static int n;
	static int[] name,x,w;
	static Res[][] dp;

	static Res solve(int idx,int used,int weight){
		Res res = new Res(0,new ArrayList<Integer>());
		res.pass.add(name[idx]);
		used |= (1<<idx);

		if(used == (1<<n)-1) return res;
		if(dp[idx][used] != null) return dp[idx][used];

		res = new Res(Double.MAX_VALUE,new ArrayList<Integer>());
		for(int i=0;i<n;i++){
			if((used & (1<<i)) == 0){
				double plus = Math.abs(x[i] - x[idx]) / (2000.0 / (70 + weight));
				Res tmp = solve(i,used,weight+w[i]);
				tmp.cost += plus;

				if(res.cost > tmp.cost){
					res = new Res(tmp.cost,tmp.pass);
				}
			}
		}

		res.pass.add(0,name[idx]);
		return dp[idx][used]=res;
	}
}

class Res{
	double cost;
	ArrayList<Integer> pass;

	Res(double cost,ArrayList<Integer> pass){
		this.cost = cost;
		this.pass = new ArrayList<Integer>(pass);
	}
}