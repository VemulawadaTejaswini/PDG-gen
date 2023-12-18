import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new RitProC().doIt();
	}
	class RitProC{
		int n;
		HashMap<String, Integer> map_str;
		HashMap<Integer, String> map_int;
		int[] prise;
		boolean[][] map;
		boolean[] close;
		int cnt;
		void doIt(){
			n = in.nextInt();
			prise = new int[n];
			map_str = new HashMap<String, Integer>();
			map_int = new HashMap<Integer, String>();
			map = new boolean[n][n];
			for(int i=0;i<n;i++){
				String obj = in.next();
				prise[i] = in.nextInt();
				map_str.put(obj, i);
				map_int.put(i, obj);
			}
			int m = in.nextInt();
			for(int i=0;i<m;i++){
				int index1 = map_str.get(in.next());
				int index2 = map_str.get(in.next());
				map[index1][index2] = map[index2][index1] = true;
			}
			int sum = 0;
			close = new boolean[n];
			Arrays.fill(close, true);
			for(int i=0;i<n;i++)if(close[i]){
				cnt = 0;
				int minPrise = dijkstra(i);
				if(cnt != 0)sum += (minPrise * cnt);
			}
			System.out.println(sum);
		}
		
		int dijkstra(int v){
			PriorityQueue<Integer> q = new PriorityQueue<Integer>();
			q.add(v);
			int minPrise = Integer.MAX_VALUE/2;
			while(q.size()>0){
				int index = q.remove();
				if(close[index] == false)continue;
				cnt++;
				close[index] = false;
				minPrise = Math.min(prise[index], minPrise);
				for(int i=0;i<n;i++)if(close[i])q.add(i);
			}
			return minPrise;
		}
		
	}	
	
}