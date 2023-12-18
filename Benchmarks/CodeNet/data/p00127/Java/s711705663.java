import java.util.*;

public class Main{
	
	char [][] map;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		init();
		while(sc.hasNext()){
			char [] c = sc.nextLine().toCharArray();
			int len = c.length;
			
			if(len % 2 != 0){
				System.out.println("NA");
				continue;
			}
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < len; i+=2){
				int col = c[i] - '0' - 1;
				int row = c[i+1] - '0' - 1;
				sb.append(map[row][col]);
			}
			System.out.println(sb.toString());
		}
	}
	
	private void init() {
		map = new char[5][6];
		int ind = 0;
		for(int i = 'a'; i <= 'z'; i++){
			map[ind % 5][ind / 5] = (char)i;
			ind++;
		}
		map[1][5] = '.';
		map[2][5] = '?';
		map[3][5] = '!';
		map[4][5] = ' ';
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}