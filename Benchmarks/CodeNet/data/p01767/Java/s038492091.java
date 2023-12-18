import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
    
    
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i = 0; i < N; i++) {
			a.add(sc.nextInt());
		}
		int m = sc.nextInt();
		ArrayList<Data> bc = new ArrayList<Data>();
		Collections.sort(a);
		for(int i = 0; i < m; i++) {
			bc.add(new Data());
		}
		
		for(int i = 0; i < m; i++) {
			bc.get(i).b = sc.nextInt();
		}
		for(int i = 0; i < m; i++) {
			bc.get(i).c = sc.nextInt();
		}
		Collections.sort(bc);
		boolean[] ans = new boolean[m];
		int score = 0;
		int id = 0;
		for(int i = 0; i < m; i++) {
			Data tmp = bc.get(i);
			for(int j = id; j < N; j++) {
				if(a.get(j) > tmp.b) break;
				score += a.get(j);
				id++;
			}
			if(score >= tmp.c) ans[tmp.id] = true;
		}
		for(int i = 0; i < m; i++) {
			System.out.println(ans[i]?"Yes":"No");
		}
		
		
	}
	static class Data implements Comparable<Data>{
		static int ID = 0;
		int id;
		int b;
		int c;
		Data() {
			id = ID++;
		}
		@Override
		public int compareTo(Data o) {
			return this.b - o.b;
		}
	}
}