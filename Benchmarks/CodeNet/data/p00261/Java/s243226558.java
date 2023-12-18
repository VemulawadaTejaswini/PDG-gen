import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			String s = sc.next();
			if(s.equals("#")){
				break;
			}
			int [][] g = new int[200][2];
			for(int i = 0; i < 200; i++){
				Arrays.fill(g[i], -1);
			}
			g['a'][0] = 'x';
			g['a'][1] = 'y';
			g['x'][1] = 'z';
			g['y'][0] = 'x';
			g['z'][0] = 'w';
			g['z'][1] = 'b';
			g['w'][0] = 'b';
			g['w'][1] = 'y';
			g['b'][0] = 'y';
			g['b'][1] = 'x';
			int now = 'a';
			boolean flg = false;
			for(int i = 0; i < s.length(); i++){
				int ind = s.charAt(i) - '0';
				if(ind >= 2){
					flg = true;
					break;
				}
				int c = g[now][ind];
				if(c == -1){
					flg = true;
					break;
				}
				now = c;
			}
			if(! flg && now == 'b'){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
	}
	
	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}