import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int H = Integer.valueOf(s.next());
		int W = Integer.valueOf(s.next());
		int K = Integer.valueOf(s.next());
		char[][] maze = new char[H][W];
		for(int i = 0; i < H; i++) {
			maze[i] = s.next().toCharArray(); 
		}
		
		int ret = 0;
		for(int i = 0; i < (1<<H); i++) {
			for(int j = 0; j < (1<<W); j++) {
				int cnt = 0;
				for(int h = 0; h < H; h++) {
					if(((i>>h)&1) == 1) {
						continue;
					}
					for(int w = 0; w < W; w++) {
						if(((j>>w)&1) == 1) {
							continue;
						}
						if(maze[h][w] == '#') {
							cnt++;
						}
					}
				}
				if(cnt == K) {
					ret++;
				}
			}
		}
		System.out.println(ret);
	}
}