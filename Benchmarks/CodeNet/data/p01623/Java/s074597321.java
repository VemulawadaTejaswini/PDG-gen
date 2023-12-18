import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {
	static int N, M;
	static ArrayList<Integer[]> Sink;
	static ArrayList<Integer[]> Bridge;
	
	static int[] uf;
	
	static private void union(int a, int b)
	{
		if(uf[a] == uf[b]) return;
		
		if(uf[a] < uf[b])
		{
			int modify = uf[b];
			for (int i = 1; i <= N; i++) {
				if(uf[i] == modify) uf[i] = uf[a];
			}
		}
		else {
			int modify = uf[a];
			for (int i = 1; i <= N; i++) {
				if(uf[i] == modify) uf[i] = uf[b];
			}
		}
	}
	
	static private void solve()
	{
		uf = new int[N+1];
		for (int i = 1; i <= N; i++) {
			uf[i] = i;
		}
		
		boolean init = true;
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < N; i++) {
			
			Integer[] island = Sink.get(i);
			hs.add(island[0]);
			
			for (int j = i+1; j < N; j++) {
				Integer[] tmp = Sink.get(j);
				if(tmp[1].intValue() == island[1].intValue())
				{
					hs.add(tmp[0]);
					i++;
				}
				else {
					break;
				}
			}
			
			if(init)
			{
				for (int j = 1; j <= N; j++) {
					uf[j] = j;
				}
				
				for (Integer[] b : Bridge) {
					b[3] = 0;
				}
			}
			
			for (Integer[] b : Bridge) {
				if(b[3].intValue() == 1) continue;
				if(!hs.contains(b[0]) || !hs.contains(b[1])) continue;
				if(uf[b[0]] == uf[b[1]]) continue;
				
				b[3] = 1;
				union(b[0], b[1]);
			}
			
			int index = -1;
			boolean preinit = false;
			for (Integer tmp : hs) {
				if(index < 0)
				{
					index = uf[tmp];
				}
				
				if(index != uf[tmp]) preinit = true;
			}
			init = preinit;
			
			//System.err.println("break");
		}
		
		int index = uf[1];
		for (int i = 2; i <= N; i++) {
			if(uf[i] != index)
			{
				System.out.println("0");
				return;
			}
		}
		
		int cost = 0;
		for (Integer[] i : Bridge) {
			if(i[3] == 1) cost += i[2];
		}
		
		System.out.println(cost);
	}
	
	static public void main(String[] args)
	{
		Scanner sca = new Scanner(System.in);
		
		while(true)
		{
			
			N = sca.nextInt();
			M = sca.nextInt();
			if(N == 0) break;
			
			Sink = new ArrayList<Integer[]>();
			for (int i = 0; i < N; i++) {
				Sink.add(new Integer[]{i+1, sca.nextInt()});
			}
			
			Collections.sort(Sink, new Comparator<Integer[]>() {
				public int compare(Integer[] a, Integer[] b) {
					int t = a[1] - b[1];
					if(t > 0) return -1;
					else if(t == 0) return 0;
					else return 1;
				}
			});
			
			Bridge = new ArrayList<Integer[]>();
			for (int i = 0; i < M; i++) {
				Bridge.add(new Integer[]{sca.nextInt(), sca.nextInt(), sca.nextInt(), 0});
			}
			
			Collections.sort(Bridge, new Comparator<Integer[]>() {
				public int compare(Integer[] a, Integer[] b) {
					int t = a[2] - b[2];
					if(t > 0) return 1;
					else if(t == 0) return 0;
					else return -1;
				}
			});
			
			solve();
		}
	}
}