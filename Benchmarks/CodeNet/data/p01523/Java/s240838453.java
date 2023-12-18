import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
      
      
public class Main {
	static HashMap<String,Boolean> map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<ArrayList<Data>> list = new ArrayList<ArrayList<Data>>();
		for(int i = 0; i < n; i++) {
			list.add(new ArrayList<Data>());
		}
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			for(int j = a; j <= b; j++) {
				list.get(j).add(new Data(i,b));
			}
		}
		for(int i = 0; i < n; i++) {
			Collections.sort(list.get(i));
		}
		int count = 0;
		boolean[] ok = new boolean[n];
		for(int i = 0; i < n; i++) {
			if(ok[i]) continue;
			if(list.get(i).isEmpty()) {
				count = -1;
				break;
			}
			Data tmp = list.get(i).get(0);
			for(int j = i; j <= tmp.a; j++) {
				ok[j] = true;
			}
			count++;
		}
		System.out.println(count==-1?"Impossible":count);
		
		
		
		
		
	}
	static class Data implements Comparable<Data>{
		int id;
		int a;
		Data(int a, int b) {
			this.id = a;
			this.a = b; 
		}
		@Override
		public int compareTo(Data o) {
			return o.a - this.a;
		}
	}
 }