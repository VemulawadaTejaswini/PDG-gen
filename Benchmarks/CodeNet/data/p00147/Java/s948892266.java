import java.util.*;
import java.io.*;

public class Main {
	int[] ans = new int[100];
	
	public int judge(int[] seat, int i){
		int key = -1;
		int[] dp = new int[18];
		int num = (i%5 == 1) ? 5 : 2;
		for(int j = 1; j < 18; j++){
			if( seat[j-1] == -1 ){
				dp[j] = dp[j-1] + 1;
				if( dp[j] >= num ){
					key = j-num;
					break;
				}
			}
		}
		return key;
	}
	public void simulate(){
		Queue<Integer> queue = new PriorityQueue<Integer>();
		Queue<Integer> time = new PriorityQueue<Integer>();
		Map<Integer, Set<Integer>> map = new HashMap<Integer, Set<Integer>>();
		int[] seat = new int[17];
		for(int i = 0; i < 17; i++){
			seat[i] = -1;
		}
		for(int i = 0; i < 30; i++){
		/*	writer.println(queue);
			writer.println(time);
			writer.println(map);
			for(int a : seat){
				writer.print(a + " ");
			}
			writer.println();*/
			int t = (time.peek() == null) ? 5*i+1 : time.peek();
			while( 5*i >= t ){
				for(int j = 0; j < seat.length; j++){
					if( map.get(t).contains(seat[j]) ){
						seat[j] = -1;
					}
				}
				while( queue.peek() != null ){
					int check = queue.peek();
					int key = judge(seat, check);
					if( key >= 0 ){
						int num = (check%5 == 1) ? 5 : 2;
						for(int j = key; j < key+num; j++){
							seat[j] = check;
						}
						ans[check] = t-check*5;
						int x = 17*(check%2) + 3*(check%3) + 19 + time.peek();
						time.offer(x);
						Set<Integer> temp = (map.get(x) != null) ? map.get(x) : new HashSet<Integer>();
						temp.add(check);
						map.put(x, temp);
						queue.remove();
					} else {
						break;
					}
				}
				time.remove();
				t = (time.peek() == null) ? 5*i+1 : time.peek();
			}
			if( queue.peek() != null ){
				queue.offer(i);
				continue;
			}
			int key = judge(seat, i);
			if( key >= 0 ){
				int num = (i%5 == 1) ? 5 : 2;
				for(int j = key; j < key+num; j++){
					seat[j] = i;
				}
				int x = 17*(i%2) + 3*(i%3) + 19 + i*5;
				time.offer(x);
				Set<Integer> temp = (map.get(x) != null) ? map.get(x) : new HashSet<Integer>();
				temp.add(i);
				map.put(x, temp);
			} else {
				queue.offer(i);
			}
		}
	}
				
	public  void solve() throws IOException{
		simulate();
		while( stdIn.hasNext() ){
			int n = stdIn.nextInt();
			writer.println(ans[n]);
			writer.flush();
		}
		writer.flush();				
	}
	public static void main (String args[]) throws IOException{
		new Main().run();
	}
	
	Scanner stdIn;
	PrintWriter writer;
	
	public void run() throws IOException{
		stdIn = null;
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			writer = new PrintWriter(System.out);
			solve();
			stdIn.close();
			writer.close();
		} catch (Exception e){
			e.printStackTrace();
			System.exit(1);
		}
	}	
}