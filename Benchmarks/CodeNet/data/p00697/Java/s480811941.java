import java.util.*;

public class Main {
	final int INF = 1 << 24;
	HashMap<C,C> pass;
	int ans;
	String [][] data;
	char [][] map;
	String [] store;
	boolean [] used;
	HashMap<Character, Character> change;
	
	class C{
		int pos ,ind;
		public C(int pos, int ind) {
			this.pos = pos;	this.ind = ind;
		}
	}
	
	private void dfs(int deep){
		if(deep == 9){
			ans++;
			return;
		}
		for(int j = 0; j< 9; j++){
			if(used[j]) continue;
			for(int i=0; i < 4; i++){
				store[deep] = data[j][i];
				if(check(deep+1)){
					used[j] = true;
					dfs(deep+1);
					used[j] = false;
				}
			}
		}
		
		return ;
	}
	
	private boolean check(int deep){
		for(C from: pass.keySet()){
			C to = pass.get(from);
			if( from.pos >= deep || from.pos <= to.pos ) continue;
			if(store[from.pos].charAt(from.ind) != change.get(store[to.pos].charAt(to.ind))){
				return false;
			}
			//System.out.println(store[from.pos].charAt(from.ind) +" "+ change.get(store[to.pos].charAt(to.ind)));
		}
		return true;
	}

	private void doit() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pass = new HashMap<C,C>();
		passCreate();
		change = new HashMap<Character, Character>();
		change.put('R', 'r');
		change.put('G', 'g');
		change.put('B', 'b');
		change.put('W', 'w');
		change.put('r', 'R');
		change.put('g', 'G');
		change.put('b', 'B');
		change.put('w', 'W');
		while(n-- > 0){
			data = new String[9][4];
			for(int i =0; i < 9; i++){
				String str = sc.next();
				for(int j =0; j < 4; j ++){
					char [] work = new char[4];
					for(int k =0; k < 4; k++){
						work[k] = str.charAt((k+j) % 4);
					}
					data[i][j] = new String(work);
				}
			}
			//ini
			ans = 0;
			map = new char[9][9];
			store = new String[9];
			used = new boolean[9];
			for(int i = 0; i < 9; i++){
				Arrays.fill(map[i], '*');
			}
			dfs(0);
			System.out.println(ans);
		}
	}
	
	private void passCreate(){
		pass.put(new C(0,1), new C(1,3));
		pass.put(new C(0,2), new C(3,0));
		
		pass.put(new C(1,3), new C(0,1));
		pass.put(new C(1,1), new C(2,3));
		pass.put(new C(1,2), new C(4,0));
		
		pass.put(new C(2,3), new C(1,1));
		pass.put(new C(2,2), new C(5,0));
		
		pass.put(new C(3,0), new C(0,2));
		pass.put(new C(3,1), new C(4,3));
		pass.put(new C(3,2), new C(6,0));
		
		pass.put(new C(4,0), new C(1,2));
		pass.put(new C(4,1), new C(5,3));
		pass.put(new C(4,2), new C(7,0));
		pass.put(new C(4,3), new C(3,1));
		
		pass.put(new C(5,0), new C(2,2));
		pass.put(new C(5,3), new C(4,1));
		pass.put(new C(5,2), new C(8,0));
		
		pass.put(new C(6,0), new C(3,2));
		pass.put(new C(6,1), new C(7,3));
		
		pass.put(new C(7,0), new C(4,2));
		pass.put(new C(7,1), new C(8,3));
		pass.put(new C(7,3), new C(6,1));
		
		pass.put(new C(8,0), new C(5,2));
		pass.put(new C(8,3), new C(7,1));
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}