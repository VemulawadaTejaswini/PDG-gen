import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Data[] list = new Data[n];
		for(int i = 0; i < n; i++) {
			list[i] = new Data(i,0);
		}
		int[] rank = new int[n];
		for(int i = 0; i < n*(n-1)/2; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			if(c > d) {
				list[a-1].w += 3;	
			}
			else if(c == d) {
				list[a-1].w += 1;
				list[b-1].w += 1;
			}
			else {
				list[b-1].w += 3;
			}
		}
		int nowRank = 0;
		int pre = -1;
		Arrays.sort(list);
		for(int i = 0; i < n; i++) {
			if(pre != list[i].w) {
				pre = list[i].w;
				nowRank = i+1;
			}
			rank[list[i].id] = nowRank;
		}
		for(int i = 0; i < n; i++) {
			System.out.println(rank[i]);
		}
		
	}
	
	static class Data implements Comparable<Data> {
		int id;
		int w;
		Data(int a, int b) {
			id = a;
			w = b;
		}
		public int compareTo(Data o1) {
			return  o1.w - this.w;
		}
	}
}