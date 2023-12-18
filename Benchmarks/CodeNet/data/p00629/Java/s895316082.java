import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
    
    
public class Main {
	static int INF = 2 << 27;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if(n == 0) break;
			Data[] data = new Data[n];
			for (int i = 0; i < n; i++) {
				data[i] = new Data(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			}
			Arrays.sort(data);
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (count < 10) {
					if (map.containsKey(String.valueOf(data[i].u))) {
						if(map.get(String.valueOf(data[i].u)) < 3) {
							map.put(String.valueOf(data[i].u), map.get(String.valueOf(data[i].u)) + 1);
							System.out.println(data[i].i);
						}
					} else {
						map.put(String.valueOf(data[i].u), 1);
						System.out.println(data[i].i);
					}
				} else if (count < 20) {
					if (map.containsKey(String.valueOf(data[i].u))) {
						if (map.get(String.valueOf(data[i].u)) < 2) {
							map.put(String.valueOf(data[i].u), map.get(String.valueOf(data[i].u)) + 1);
							System.out.println(data[i].i);
						}
					} else {
						map.put(String.valueOf(data[i].u), 1);
						System.out.println(data[i].i);
					}
				} else if (count < 26) {
					if (map.containsKey(String.valueOf(data[i].u))) {
						if (map.get(String.valueOf(data[i].u)) < 1) {
							map.put(String.valueOf(data[i].u), map.get(String.valueOf(data[i].u)) + 1);
							System.out.println(data[i].i);
						}
					} else {
						map.put(String.valueOf(data[i].u), 1);
						System.out.println(data[i].i);
					}
				} else {
					break;
				}

			} 
		}
		
		
	}
	static class Data implements Comparable<Data>{
		int i;
		int u;
		int a;
		int p;
		Data(int i, int u, int a, int p) {
			this.i = i;
			this.u = u;
			this.a = a;
			this.p = p;
		}
		@Override
		public int compareTo(Data o) {
			if(o.a == this.a) {
				if(o.p == this.p) {
					return this.i - o.i;
				}
				return this.p - o.p;
			}
			return o.a - this.a;
		}
	}
	
	
	
}