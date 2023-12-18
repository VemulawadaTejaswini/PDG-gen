import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] top = new String[4];
		top[0] = sc.next();
		top[1] = sc.next();
		top[2] = sc.next();
		if(n == 3) {
			PriorityQueue<Data> list = new PriorityQueue<Data>();
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 3; k++) {
					if(j == k) continue;
					list.add(new Data(top[j],top[k],j,k));
				}
			}
			list.poll();
			list.poll();
			System.out.println(list.poll().num);
			return;
		}
		top[3] = sc.next();
		
		for(int i = 4; i < n; i++) {
			PriorityQueue<Data> list = new PriorityQueue<Data>();
			String in = sc.next();
			list.add(new Data(top[0],in,0,4));
			list.add(new Data(top[1],in,1,4));
			list.add(new Data(top[2],in,2,4));
			list.add(new Data(top[3],in,3,4));
			list.add(new Data(in,top[0],4,0));
			list.add(new Data(in,top[1],4,1));
			list.add(new Data(in,top[2],4,2));
			list.add(new Data(in,top[3],4,3));
			for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 4; k++) {
					if(j == k) continue;
					list.add(new Data(top[j],top[k],j,k));
				}
			}
			boolean[] use = new boolean[5];
			for(int j = 0; j < 3; j++) {
				Data tmp = list.poll();
				use[tmp.c] = true;
				use[tmp.d] = true;
			}
			if(!use[0]) top[0] = in;
			else if(!use[1]) top[1] = in;
			else if(!use[2]) top[2] = in;
			else if(!use[3]) top[3] = in;
		}
		PriorityQueue<Data> list = new PriorityQueue<Data>();
		for(int j = 0; j < 4; j++) {
			for(int k = 0; k < 4; k++) {
				if(j == k) continue;
				list.add(new Data(top[j],top[k],j,k));
			}
		}
		list.poll();
		list.poll();
		System.out.println(list.poll().num);
	}
	static class Data implements Comparable<Data>{
		int num;
		int c;
		int d;
		Data(String a, String b,int c, int d) {
			num = Integer.parseInt(a + b);
			this.c = c;
			this.d = d;
		}
		@Override
		public int compareTo(Data o) {
			return this.num - o.num;
		}
	}
	
}