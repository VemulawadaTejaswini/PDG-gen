import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		ArrayDeque<int[]> que = new ArrayDeque<int[]>();
		int x, y, flag, xs = 0, ys = 0, count = 0;
		
		String string = reader.readLine();
		y = Integer.valueOf(string.split(" ")[0]);
		x = Integer.valueOf(string.split(" ")[1]);
		flag = Integer.valueOf(string.split(" ")[2]);
		
		char map[][] = new char[y][x];
		for(int i = 0; i < y; i++){
			map[i] = reader.readLine().toCharArray();
		}
		
		for(int i = 0; i < y; i++){
			for(int j = 0; j < x; j++){
				if(map[i][j] == 'S'){
					ys = i;
					xs = j;
					j = x;
					i = y;
				}
			}
		}
		
		for(int i = 1; i <= flag; i++){
			boolean visit[][] = new boolean[y][x];
			que.addLast(new int[]{ys, xs, count});
			while(!que.isEmpty()){
				ys = que.getFirst()[0];
				xs = que.getFirst()[1];
				count = que.getFirst()[2];
				que.removeFirst();
				
				if(map[ys][xs] - '0' == i){
					que = new ArrayDeque<int[]>();
					break;
				}
				if(visit[ys][xs]) continue;
				visit[ys][xs] = true;
				
				if(ys + 1 < y && map[ys + 1][xs] != 'X'){ que.addLast(new int[]{ys + 1, xs, count + 1}); }
				if(ys - 1 >=0 && map[ys - 1][xs] != 'X'){ que.addLast(new int[]{ys - 1, xs, count + 1}); }
				if(xs + 1 < x && map[ys][xs + 1] != 'X'){ que.addLast(new int[]{ys, xs + 1, count + 1}); }
				if(xs - 1 >=0 && map[ys][xs - 1] != 'X'){ que.addLast(new int[]{ys, xs - 1, count + 1}); }
			}
		}
		System.out.println(count);
		reader.readLine();
	}
}