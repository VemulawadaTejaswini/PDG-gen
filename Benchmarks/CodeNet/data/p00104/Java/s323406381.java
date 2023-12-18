import java.util.*;
import static java.util.Arrays.*;

public class Main {
	static int W,H;
	static char[][] room;
	static Scanner sc = new Scanner(System.in);
	
	static boolean read() {
		H = sc.nextInt(); W = sc.nextInt();
		if(W == 0 && H == 0) return false;
		room = new char[H][W];
		for(int i = 0; i < H; i++) {
			room[i] = sc.next().toCharArray();
		}
		return true;
	}
	
	static String solve() {
		boolean[][] visited = new boolean[H][W];
		for(int i = 0; i < H; i++) fill(visited[i], false);
		int x = 0, y = 0;
		
		while(true) {
			
			if(visited[y][x]) return "LOOP";
			
			visited[y][x] = true;
			char tile = room[y][x];
			if(tile == '>') {
				x++;
			} else if(tile == '<') {
				x--;
			} else if(tile == 'v') {
				y++;
			} else if(tile == '^') {
				y--;
			} else {
				break;
			}
		}
		
		return "" + x + " " + y;
	}
	
	public static void main(String[] args) {
		while(read()) {
			System.out.println(solve());
		}
	}
}