
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			boolean[][] map = new boolean[8][8];
			for(int i=0;i<8;i++) {
				String str = sc.next();
				for(int j=0;j<8;j++) map[i][j] = str.charAt(j) == '1';
			}
			
			System.out.println(search(map));
		}
	}
	
	String search(boolean[][]map) {
		for(int i=0;i<8;i++) for(int j=0;j<8;j++) if(map[i][j]){
			if(i+3<8 && map[i+3][j]) return "B";
			else if( j+3 < 8 && map[i][j+3]) return "C";
			else if( j-1 >= 0 && i+2 < 8 && map[i+2][j-1] ) return "D";
			else if( j+2 < 8 && i+1 < 8 && map[i+1][j+2] ) return "E";
			else if( j+1 < 8 && i+2 < 8 && map[i+2][j+1] ) return "F";
			else if( j+1 < 8 && i+1 < 8 && !map[i+1][j+1] ) return "G";
			else return "A";
		}
		return "";
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}