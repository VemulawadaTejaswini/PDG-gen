import java.util.*;
import java.math.BigInteger;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			ArrayList<ArrayList<Edge>> map = new ArrayList<ArrayList<Edge>>();
			for(int i=0;i<n;i++){
				ArrayList<Edge> tmp = new ArrayList<Edge>();
				for(int j=0;j<2;j++){
					int to = sc.nextInt();
					int cost = sc.nextInt();
					tmp.add(new Edge(to,cost));
				}
				map.add(tmp);
			}

			boolean[] used = new boolean[n];
			BigInteger ans = BigInteger.ONE;
			for(int i=0;i<n;i++){
				if(!used[i]){
					int max = 0;
					int now = i;
					int before = i;

					while(now != i || before == i){
						Edge a = map.get(now).get(0);
						Edge b = map.get(now).get(1);

						max = Math.max(max,a.cost);
						max = Math.max(max,b.cost);

						int tmp = now;
						now = (before != a.to ? a.to : b.to);
						before = tmp;
					}

					int sum = 0;
					now = i;
					while(!used[now]){
						used[now] = true;
						Edge a = map.get(now).get(0);
						Edge b = map.get(now).get(1);
						if(a.cost == max) sum++;
						if(b.cost == max) sum++;

						now = (!used[a.to] ? a.to : b.to);
					}

					ans = ans.multiply(new BigInteger(Integer.toString(sum/2)));
				}
			}

			System.out.println(ans.mod(new BigInteger("10007")));
		}
	}

}

class Edge{
	int to,cost;

	Edge(int to,int cost){
		this.to = to;
		this.cost = cost;
	}
}