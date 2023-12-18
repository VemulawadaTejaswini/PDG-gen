import java.io.*;
import java.util.*;

public class Main{
	private static int[] val = new int[8];
	private static int[] dp = new int[(int)Math.pow(8,8)+1];

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int start = 0;
		for(int i=0;i<8;i++){
			val[i] = (int)Math.pow(8,i);
			start += i * val[i];
		}

		Queue<State> open = new LinkedList<State>();
		open.add(new State(start,0,0));

		dp[start] = -1;

		while(!open.isEmpty()){
			State st = open.poll();

			if(st.idx >= 4){
				int aft = change(st.t,st.idx,st.idx-4);
				if(dp[aft] == 0){
					dp[aft] = st.cost + 1;
					open.add(new State(aft,st.cost+1,st.idx-4));
				}
			}
			else if(st.idx < 4){
				int aft = change(st.t,st.idx,st.idx+4);
				if(dp[aft] == 0){
					dp[aft] = st.cost + 1;
					open.add(new State(aft,st.cost+1,st.idx+4));
				}
			}
			if(st.idx % 4 > 0){
				int aft = change(st.t,st.idx,st.idx-1);
				if(dp[aft] == 0){
					dp[aft] = st.cost + 1;
					open.add(new State(aft,st.cost+1,st.idx-1));
				}
			}
			if(st.idx % 4 < 3){
				int aft = change(st.t,st.idx,st.idx+1);
				if(dp[aft] == 0){
					dp[aft] = st.cost + 1;
					open.add(new State(aft,st.cost+1,st.idx+1));
				}
			}
		}

		dp[start] = 0;

		while(br.ready()){
			String[] str = br.readLine().split(" ");
			int sum = 0;
			for(int i=0;i<8;i++) sum += Integer.parseInt(str[i]) * val[i];
			System.out.println(dp[sum]);
		}
	}

	private static int change(int t,int from,int to){
		int digit = (t / val[to]) % val[1];
		return t - digit * val[to] + digit * val[from];
	}

	private static void printSeq(int t){
		for(int i=0;i<8;i++){
			System.out.print(((t / val[i]) % val[1]) + " ");
		}
		System.out.println();
	}
}

class State{
	int t,cost,idx;

	State(int t,int cost,int idx){
		this.t = t;
		this.cost = cost;
		this.idx = idx;
	}
}