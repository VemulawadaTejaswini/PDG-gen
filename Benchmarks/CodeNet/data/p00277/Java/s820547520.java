import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		TreeMap<Integer,Integer> map = new TreeMap<Integer, Integer>();  //point id
		TreeMap<Integer,Integer> map2 = new TreeMap<Integer, Integer>(); //id point
		int N = stdIn.nextInt();
		int R = stdIn.nextInt();
		int L = stdIn.nextInt();
		int[] d = new int[R+1];
		int[] t = new int[R+1];
		int[] x = new int[R+1];
		
		for(int i = 0; i < R; i++) {
			d[i] = stdIn.nextInt();
			t[i] = stdIn.nextInt();
			x[i] = stdIn.nextInt();
		}
		d[R] = 1;
		t[R] = L;
		x[R] = 0;
		for(int i = 0; i < N; i++) {
			map.put(0, 1);
			map2.put(i+1,0);
		}
		int nowtime = 0;
		int[] time = new int[N+1];
		for(int i = 0; i <= R; i++) {
			time[map.get(map.lastKey())] += t[i] - nowtime;
			map.put(map2.get(d[i]) + x[i],d[i] );
			map2.put(d[i], map2.get(d[i]) + x[i]);
			nowtime = t[i];
			
			map.remove(map2.get(d[i]) - x[i]);
			
		}
		int max = 0;
		int id = 0;
		for(int i = 0; i < N+1; i++) {
			if(max < time[i]) {
				max = time[i];

				id = i;
			}
		}
		
		System.out.println(id);
		
		
		
		
		
	}
}