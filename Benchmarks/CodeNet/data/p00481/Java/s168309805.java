import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class Main {
	int h, w, n, ans = 0;
	char[][] field = new char[1000][1000];
	int[][] checker = new int[1000][1000];
	Queue<Integer> que = new LinkedList<>();
	
	void run() {
		Scanner scan = new Scanner(System.in);
		h = scan.nextInt();
		w = scan.nextInt();
		n = scan.nextInt();
		for(int i = 0; i < h; i++) {
			field[i] = scan.next().toCharArray();
		}
		
		outside : for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(field[i][j] == 'S') {
					que.offer(j);
					que.offer(i);
					que.offer(49);
					que.offer(0);
					que.offer(0);
					checker[i][j] = 1;
					
					break outside;
				}
			}
		}	
		search();

		System.out.println(ans);
	}
	
	void search() {
		
		int x, y, hp, count, ch;
		x = que.poll();
		y = que.poll();
		hp = que.poll();
		count = que.poll();
		ch = que.poll();
		
		if(field[y][x] >= 49 && field[y][x] <= 57 && 
				field[y][x] == hp) {
			hp++;
			ch = 0;
			refresh_field();
			refresh_checker();
		}
		
		if(hp-1 == 48 + n) {
			ans = count;
		} else {
			count++;
			
			if(ch != 3 && y-1 >= 0 && checker[y-1][x] != 1 
					&& field[y-1][x] != 'X') {
//				System.out.print('u');
				que.offer(x);
				que.offer(y-1);
				que.offer(hp);
				que.offer(count);
				que.offer(1);
				checker[y-1][x] = 1;
			}
			if(ch != 1 && y+1 < h && checker[y+1][x] != 1
					&& field[y+1][x] != 'X') {
//				System.out.print('d');
				que.offer(x);
				que.offer(y+1);
				que.offer(hp);
				que.offer(count);
				que.offer(3);
				checker[y+1][x] = 1;
			}
			if(ch != 4 && x-1 >= 0 && checker[y][x-1] != 1
					&& field[y][x-1] != 'X') {
//				System.out.print('l');
				que.offer(x-1);
				que.offer(y);
				que.offer(hp);
				que.offer(count);
				que.offer(2);
				checker[y][x-1] = 1;
			}
			if(ch != 2 && x+1 < w && checker[y][x+1] != 1
					&& field[y][x+1] != 'X') {
//				System.out.print('r');
				que.offer(x+1);
				que.offer(y);
				que.offer(hp);
				que.offer(count);
				que.offer(4);
				checker[y][x+1] = 1;
			}
			
			search();
		}
			
		
	}
	
	void refresh_field() {
		while(que.peek() != null) {
			que.poll();
		}
	}
	
	void refresh_checker() {
		for(int i = 0; i < 1000; i++) {
			for(int j = 0; j < 1000; j++) {
				checker[i][j] = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}

