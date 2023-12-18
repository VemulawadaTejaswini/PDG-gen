import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	static class Pair implements Comparable<Pair>{
		int weight;
		int val;
		Pair(int w , int v){
			weight = w;
			val = v;
		}
		@Override
		public int compareTo(Pair o) {
			if(weight == o.weight){
				return o.val - val;
			}
			return weight - o.weight;
		}
		@Override
		public String toString() {
			return weight + " " + val;
		}
	}
	static int solve(int v , int L , int[] V , int W[]){
		int N = Integer.toBinaryString(v).length();
		int vs[] = new int[N];
		int ws[] = new int[N];
		int index = 0;
		int tv = 0;
		int tw = 0;
		while(v > 0){
			vs[index] = V[v - 1];
			ws[index] = W[v - 1];
			tv += vs[index];
			tw += ws[index];
			index++;
			v = v / 2;
		}
		if(tw <= L){
			return tv;
		}
		int N2 = N / 2;
//		System.out.println(L+" "+Arrays.toString(vs)+" "+Arrays.toString(ws)+" "+N2);
		List<Pair> ps = new ArrayList<Pair>();
		int result = 0;
		for(int i = 0 ; i < (1 << N2) ; ++i){
			int val = 0;
			int weight = 0;
			for(int j = 0 ; j < N2 ; ++j){
				if(((1 << j) & i) != 0){
					val += vs[j];
					weight += ws[j];
				}
			}
			if(weight > L){
				continue;
			}
//			System.out.println(val+" "+weight+" "+i);
			result = Math.max(result, val);
			ps.add(new Pair(weight , val));
		}
		Collections.sort(ps);
		int mv = 0;
		for(Pair p : ps){
			p.val = Math.max(p.val, mv);
			mv = Math.max(p.val, mv);
		}
//		System.out.println(ps);
		int res = N - N / 2;
		for(int i = 0 ; i < (1 << res) ; ++i){
			int val = 0;
			int weight = 0;
			for(int j = 0 ; j < res ; ++j){
				if(((1 << j) & i) != 0){
					val += vs[j + N2];
					weight += ws[j + N2];
				}
			}
			if(weight > L){
				continue;
			}
			int leftWeight = L - weight;
			int left = 0;
			int right = ps.size() - 1;
			while(right - left > 1){
				int mid = (left + right) / 2;
				Pair p = ps.get(mid);
				if(p.weight <= leftWeight){
					left = mid;
				}else{
					right = mid;
				}
			}
			result = Math.max(result, val + ps.get(left).val);
		}
		return result;
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		int V[] = new int[N];
		int W[] = new int[N];
		for(int i = 0 ; i < N ; ++i){
			line = br.readLine();
			String a[] = line.split(" ");
			V[i] = Integer.parseInt(a[0]);
			W[i] = Integer.parseInt(a[1]);
		}
		line = br.readLine();
		int Q = Integer.parseInt(line);
		for(int i = 0 ; i < Q ; ++i){
			line = br.readLine();
			String a[] = line.split(" ");
			int v = Integer.parseInt(a[0]);
			int L = Integer.parseInt(a[1]);
			System.out.println(solve(v, L, V, W));
		}
	}
}
