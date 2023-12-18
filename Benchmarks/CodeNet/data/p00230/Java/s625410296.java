import java.awt.*;
import java.awt.geom.*;
import java.io.*;
import java.util.*;
class Main {
	static int n;
	static int[] listA;
	static int[] listB;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			n = sc.nextInt();
			if(n == 0) break;
			listA = new int[n];
			listB = new int[n];
			for(int i = 0; i < n; i++) {
				listA[i] = sc.nextInt();
			}
			for(int i = 0; i < n; i++) {
				listB[i] = sc.nextInt();
			}
			int res = solv();
			
			System.out.println((res == -1)?"NA":res);
		}
	}
	
	static int[] stA;
	static int[] stB;
	static Queue<Data> queue = new ArrayDeque<Data>();
	
	static int solv() {
		stA = new int[listA.length+50];
		stB = new int[listB.length+50];
		
		Arrays.fill(stA, 2 << 28);
		Arrays.fill(stB, 2 << 28);
		
		queue.clear();
		queue.add(new Data(true,0,0));
		
		while(!queue.isEmpty()) {
			Data tmp = queue.poll();
			if(tmp.l) {
				if(stA[tmp.now] <= tmp.count) continue;
				if(tmp.now >= listA.length && stA[tmp.now] > tmp.count) {
					stA[tmp.now] = tmp.count;
					continue;
				}
				if(tmp.now >= listA.length) break;
				if(listA[tmp.now] == 2) {
					queue.add(new Data(true,tmp.now-1,tmp.count));
					continue;
				}
				stA[tmp.now] = tmp.count;
				if(tmp.now+1 < n && listA[tmp.now] == 1 && listA[tmp.now+1] == 1) {
					queue.add(new Data(true,tmp.now+1,tmp.count));
					continue;
				}
				if(tmp.now+2 < stB.length && stB[tmp.now+2] > tmp.count+1) queue.add(new Data(false,tmp.now+2,tmp.count+1));
				if(tmp.now+1 < stB.length && stB[tmp.now+1] > tmp.count+1) queue.add(new Data(false,tmp.now+1,tmp.count+1));
				if(tmp.now+0 < stB.length && stB[tmp.now+0] > tmp.count+1) queue.add(new Data(false,tmp.now+0,tmp.count+1));
			}
			else {
				if(stB[tmp.now] <= tmp.count) continue;
				if(tmp.now >= listB.length && stB[tmp.now] > tmp.count) {
					stB[tmp.now] = tmp.count;
					continue;
				}
				if(tmp.now >= listB.length) break;
				if(listB[tmp.now] == 2) {
					queue.add(new Data(true,tmp.now-1,tmp.count));
					continue;
				}
				stB[tmp.now] = tmp.count;
				if(tmp.now+1 < n && listB[tmp.now] == 1 && listB[tmp.now+1] == 1) {
					queue.add(new Data(false,tmp.now+1,tmp.count));
					continue;
				}
				if(tmp.now+2 < stA.length && stA[tmp.now+2] > tmp.count+1) queue.add(new Data(true,tmp.now+2,tmp.count+1));
				if(tmp.now+1 < stA.length && stA[tmp.now+1] > tmp.count+1) queue.add(new Data(true,tmp.now+1,tmp.count+1));
				if(tmp.now+0 < stA.length && stA[tmp.now+0] > tmp.count+1) queue.add(new Data(true,tmp.now+0,tmp.count+1));
			}
		}
		int ret = 2 << 28;
		for(int i = n-1; i < stA.length; i++) {
			ret = Math.min(stA[i], ret);
			ret = Math.min(stB[i], ret);
		}
		queue.clear();
		queue.add(new Data(false,0,0));
		
		stA = new int[listA.length+50];
		stB = new int[listB.length+50];
		
		Arrays.fill(stA, 2 << 28);
		Arrays.fill(stB, 2 << 28);
		while(!queue.isEmpty()) {
			Data tmp = queue.poll();
			
			if(tmp.l) {
				if(stA[tmp.now] <= tmp.count) continue;
				if(tmp.now >= listA.length && stA[tmp.now] > tmp.count) {
					stA[tmp.now] = tmp.count;
					continue;
				}
				if(tmp.now >= listA.length) break;
				if(listA[tmp.now] == 2) {
					queue.add(new Data(true,tmp.now-1,tmp.count));
					continue;
				}
				stA[tmp.now] = tmp.count;
				if(tmp.now+1 < listA.length && listA[tmp.now] == 1 && listA[tmp.now+1] == 1) {
					queue.add(new Data(true,tmp.now+1,tmp.count));
					continue;
				}
				if(tmp.now+2 < stB.length && stB[tmp.now+2] > tmp.count+1) queue.add(new Data(false,tmp.now+2,tmp.count+1));
				if(tmp.now+1 < stB.length && stB[tmp.now+1] > tmp.count+1) queue.add(new Data(false,tmp.now+1,tmp.count+1));
				if(tmp.now+0 < stB.length && stB[tmp.now+0] > tmp.count+1) queue.add(new Data(false,tmp.now+0,tmp.count+1));
			}
			else {
				if(stB[tmp.now] <= tmp.count) continue;
				if(tmp.now >= listB.length && stB[tmp.now] > tmp.count) {
					stB[tmp.now] = tmp.count;
					continue;
				}
				if(tmp.now >= listB.length) break;
				if(listB[tmp.now] == 2) {
					queue.add(new Data(true,tmp.now-1,tmp.count));
					continue;
				}
				stB[tmp.now] = tmp.count;
				if(tmp.now+1 < listB.length && listB[tmp.now] == 1 && listB[tmp.now+1] == 1) {
					queue.add(new Data(false,tmp.now+1,tmp.count));
					continue;
				}
				if(tmp.now+2 < stA.length && stA[tmp.now+2] > tmp.count+1) queue.add(new Data(true,tmp.now+2,tmp.count+1));
				if(tmp.now+1 < stA.length && stA[tmp.now+1] > tmp.count+1) queue.add(new Data(true,tmp.now+1,tmp.count+1));
				if(tmp.now+0 < stA.length && stA[tmp.now+0] > tmp.count+1) queue.add(new Data(true,tmp.now+0,tmp.count+1));
			}
		}
		queue.clear();
		for(int i = n-1; i < stA.length; i++) {
			ret = Math.min(stA[i], ret);
			ret = Math.min(stB[i], ret);
		}
		
		return (ret == 2 << 28)?-1:ret;
	
	}
	
	static class Data {
		boolean l;
		int now;
		int count;
		Data(boolean c,int a, int b) {
			now = a;
			count = b;
			l = c;
		}
	}
	
}