import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
    
    
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[300001];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		Data[] bc = new Data[300001];
		Arrays.sort(a);
		for(int i = 0; i < m; i++) {
			bc[i] = new Data();
		}
		for(int i = 0; i < m; i++) {
			bc[i].b = sc.nextInt();
		}
		for(int i = 0; i < m; i++) {
			bc[i].c = sc.nextInt();
		}
		Arrays.sort(bc);
		boolean[] ans = new boolean[300001];
		int score = 0;
		int id = 0;
		for(int i = 0; i < m; i++) {
			Data tmp = bc[i];
			for(int j = id; j < N; j++) {
				if(a[j] > tmp.b) break;
				score += a[j];
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