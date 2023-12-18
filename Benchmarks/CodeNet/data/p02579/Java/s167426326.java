import java.awt.*;
import java.io.*;
import java.util.*;
 
public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new TestB().doIt();
	}
	class TestB{
		void doIt() {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int ch = sc.nextInt() - 1;
			int cw = sc.nextInt() - 1;
			int dh = sc.nextInt() - 1;
			int dw = sc.nextInt() - 1;
			
			int count[][] = new int[H][W];
			boolean map[][] = new boolean[H][W];
			
			PriorityQueue<Pos> array = new PriorityQueue<Pos>();
			
			for(int h = 0;h < H;h++) {
				String str = sc.next();
				for(int w = 0;w < W;w++) {
					count[h][w] = 10000000;
					if(h == ch && w == cw) {
						count[h][w] = 0;
						array.add(new Pos(h,w,0));
					}
					if(str.substring(w, w+1).equals("#")) {
						map[h][w] = false;
					}else {
						map[h][w] = true;
					}
				}
			}
			
			int mh[] = {1,-1,0,0};
			int mw[] = {0,0,1,-1};
			int mmh[] = {-2,-2,-2,-2,-2,
					-1,-1,-1,-1,-1,
					0,0,0,0,
					1,1,1,1,1,
					2,2,2,2,2};
			int mmw[] = {-2,-1,0,1,2,
					-2,-1,0,1,2,
					-2,-1,1,2,
					-2,-1,0,1,2,
					-2,-1,0,1,2};
			int lengthm = 4;
			int lengthmm = 24;
			int cc = 0;
			
			while(array.size() > 0) {
				Pos p = array.poll();
//				System.out.println(p.c+" "+p.h+" "+p.w);
				for(int i = 0;i < lengthm;i++) {
					ch = p.h + mh[i];
					cw = p.w + mw[i];
					cc = p.c;
					if(ch >= 0 && cw >= 0 && ch < H && cw < W) {
						if(map[ch][cw]) {
							if(count[ch][cw] > cc) {
								count[ch][cw] = cc;
								array.add(new Pos(ch,cw,cc));
							}
						}
					}
				}
				for(int i = 0;i < lengthmm;i++) {
					ch = p.h + mmh[i];
					cw = p.w + mmw[i];
					cc = p.c + 1;
					if(ch >= 0 && cw >= 0 && ch < H && cw < W) {
						if(map[ch][cw]) {
							if(count[ch][cw] > cc) {
								count[ch][cw] = cc;
								array.add(new Pos(ch,cw,cc));
							}
						}
					}
				}
				
			}
			
			if(count[dh][dw] > 5000000) {
				System.out.println(-1);
			}else {
				System.out.println(count[dh][dw]);
			}
		}
	}
	
//	class Pos{
	class Pos implements Comparable<Pos> {
		int h,w,c;
		public Pos(int h,int w,int c) {
			this.h = h;
			this.w = w;
			this.c = c;
		}
		public int compareTo(Pos other) {
            return this.c - other.c;
        }
	}
}