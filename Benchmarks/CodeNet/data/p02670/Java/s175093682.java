import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P[][] = new int[N][N];
		for (int i=0;i<N;i++) {
			for (int j=0;j<N;j++) {
				P[i][j] = i*N+j+1;
			}
		}
		Main main = new Main();
		int count =0;

		for (int i =0;i<N*N;i++) {
			Queue<Point> queue = new ArrayDeque<Point>();
			int temp =sc.nextInt()-1;
			int tempi = temp/N;
			int tempj = temp%N;
			int min = N-tempj-1;
			Point p = main.new Point();
			p.x = tempi;
			p.y = tempj;
			p.step = 0;
			queue.add(p);
			int tempT[][] =new int[N][N];
			for (int k=0;k<N;k++) {
				for (int j=0;j<N;j++) {
					tempT[k][j] = -1;
				}
			}
			while (queue.isEmpty()==false) {
				Point t = queue.poll();
				if (t.step>=min) {
					continue;
				}
				if(t.x==0||t.y==0||t.x==N-1||t.y==N-1) {
					min = t.step;
					continue;
				}
				if (tempT[t.x][t.y]==0) {
					continue;
				}
				if (P[t.x][t.y+1]!=0) {
					p = main.new Point();
					p.x = t.x;
					p.y = t.y+1;
					p.step= t.step+1;
					queue.add(p);
				} else {
					p = main.new Point();
					p.x = t.x;
					p.y = t.y+1;
					p.step= t.step;
					tempT[t.x][t.y] = p.step;
					queue.add(p);
				}
				if (P[t.x][t.y-1]!=0) {
					p = main.new Point();
					p.x = t.x;
					p.y = t.y-1;
					p.step= t.step+1;
					queue.add(p);
				} else {
					p = main.new Point();
					p.x = t.x;
					p.y = t.y-1;
					p.step= t.step;
					tempT[t.x][t.y] = p.step;
					queue.add(p);
				}
				if (P[t.x+1][t.y]!=0) {
					p = main.new Point();
					p.x = t.x+1;
					p.y = t.y;
					p.step= t.step+1;
					queue.add(p);
				} else {
					p = main.new Point();
					p.x = t.x+1;
					p.y = t.y;
					p.step= t.step;
					tempT[t.x][t.y] = p.step;
					queue.add(p);
				}
				if (P[t.x-1][t.y]!=0) {
					p = main.new Point();
					p.x = t.x-1;
					p.y = t.y;
					p.step= t.step+1;
					queue.add(p);
				} else {
					p = main.new Point();
					p.x = t.x-1;
					p.y = t.y;
					p.step= t.step;
					tempT[t.x][t.y] = p.step;
					queue.add(p);
				}
			}
			count +=min;
			P[tempi][tempj]= 0;
		}
		System.out.println(count);
	}

	public class Point {
		int x;
		int y;
		int step;
	}

}