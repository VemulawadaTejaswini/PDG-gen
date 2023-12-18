import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main{
	static int map[][];
	static int fl[][] = {{4, 2}, {2, 4}};
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main app = new Main();
		String string, str[];
		
		int w, h, n, t[][], c, d, x, y;
		boolean visit[][], judge;
		while(!(string = reader.readLine()).equals("0 0")){
			str = string.split(" ");
			w = Integer.valueOf(str[0]);
			h = Integer.valueOf(str[1]);
			
			map = new int[w][h];
			visit = new boolean[w][h];
			judge = false;
			
			t = new int[2][2];
			for(int i = 0; i < 2; i++){
				str = reader.readLine().split(" ");
				t[i][0] = Integer.valueOf(str[0]) - 1;
				t[i][1] = Integer.valueOf(str[1]) - 1;
			}
			n = Integer.valueOf(reader.readLine());
			for(int i = 0; i < n; i++){
				str = reader.readLine().split(" ");
				c = Integer.valueOf(str[0]);
				d = Integer.valueOf(str[1]);
				x = Integer.valueOf(str[2]) - 1;
				y = Integer.valueOf(str[3]) - 1;
				
				app.set(c, d, x, y);
			}
			
			Stack<int[]> s = new Stack<int[]>();
			s.push(t[0]);
			
			int sign = map[t[0][0]][t[0][1]];
			while(!s.isEmpty()){
				int now[] = s.pop();
				
				if(now[0] == t[1][0] && now[1] == t[1][1]){
					judge = true;
					break;
				}
				
				if(now[0] < 0 || now[0] >= w || now[1] < 0 || now[1] >= h || visit[now[0]][now[1]] || map[now[0]][now[1]] != sign) continue;
				visit[now[0]][now[1]] = true;
				
				s.push(new int[]{now[0] + 1, now[1]});
				s.push(new int[]{now[0] - 1, now[1]});
				s.push(new int[]{now[0], now[1] + 1});
				s.push(new int[]{now[0], now[1] - 1});
			}
			
			if(judge) System.out.println("OK");
			else System.out.println("NG");
		}
		reader.close();
	}
	
	public void set(int c, int d, int x, int y){
		for(int i = 0; i < fl[d][0]; i++){
			for(int j = 0; j < fl[d][1]; j++){
				map[x + i][y + j] = c;
			}
		}
	}
}