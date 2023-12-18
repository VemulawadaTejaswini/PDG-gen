
import java.io.*;
import java.util.*;

public class Main {
	int[][] top = new int[3][3];
	int[][] front = new int[3][3];
	
	Dice<Integer> init = new Dice<>(1, 6, 5, 2, 3, 4);
	public int toIdx(int x, int y, int z){
		return x + y * 3 + z * 9;
	}
	public void dfs(int idx, ArrayList<Dice<Integer>> dices, Set<Integer> answer){
		if(idx == 27){
			int ans = 0;
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 3; j++){
					int id = toIdx(2, i, j);
					ans += dices.get(id).get(Dice.EAST);
				}
			}
			answer.add(ans);
			return;
		}
		
		int x = idx % 3;
		int y = idx / 3 % 3;
		int z = idx / 9 % 3;
		
		Dice<Integer> cur = init;
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 4; cur = cur.rollClockWise(), j++){
				if(x != 0 && dices.get(toIdx(x - 1, y, z)).get(Dice.EAST) + cur.get(Dice.WEST) != 7) continue;
				if(y != 0 && dices.get(toIdx(x, y - 1, z)).get(Dice.SOUTH) + cur.get(Dice.NORTH) != 7) continue;
				if(z != 0 && dices.get(toIdx(x, y, z - 1)).get(Dice.BOTTOM) + cur.get(Dice.TOP) != 7) continue;
				if(z == 0 && top[y][x] != 0 && top[y][x] != cur.get(Dice.TOP)) continue;
				if(y == 2 && front[z][x] != 0 && front[z][x] != cur.get(Dice.SOUTH)) continue;
				dices.set(idx, cur);
				dfs(idx + 1, dices, answer);
			}
			if(i % 2 == 0) cur = cur.rollNorth();
			else cur = cur.rollEast();
		}
	}
	
	public void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while(N-- > 0){
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 3; j++){
					top[i][j] = sc.nextInt();
				}
			}
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 3; j++){
					front[i][j] = sc.nextInt();
				}
			}
			ArrayList<Dice<Integer>> dices = new ArrayList<>();
			for(int i = 0; i < 27; i++){
				dices.add(null);
			}
			TreeSet<Integer> ans = new TreeSet<>();
			dfs(0, dices, ans);
			if(ans.size() == 0){
				System.out.println(0);
			}else{
				boolean flg = false;
				for(int val : ans){
					if(flg) System.out.print(" ");
					flg = true;
					System.out.print(val);
				}
				System.out.println();
			}	
		}
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}

class Dice<T> {
	public static final int TOP = 0;
	public static final int BOTTOM = 5;
	public static final int EAST = 4;
	public static final int WEST = 1;
	public static final int NORTH = 3;
	public static final int SOUTH = 2;
	
	private final int[] id = new int[6];
	private final ArrayList<T> values;
	
	public Dice(){
		values = new ArrayList<>(6);
		for(int i = 0; i < 6; i++){
			id[i] = i;
			values.add(null);
		}
	}
	
	public Dice(T top, T bottom, T north, T south, T east, T west){
		this();
		values.set(TOP, top);
		values.set(BOTTOM, bottom);
		values.set(EAST, east);
		values.set(WEST, west);
		values.set(NORTH, north);
		values.set(SOUTH, south);
	}
	
	private Dice(Dice<T> d){
		values = d.values;
		for(int i = 0; i < 6; i++){
			id[i] = d.id[i];
		}
	}

	public Dice<T> rollNorth(){
		return roll(TOP, SOUTH, BOTTOM, NORTH);
	}
	public Dice<T> rollSouth(){
		return roll(TOP, NORTH, BOTTOM, SOUTH);
	}
	public Dice<T> rollWest(){
		return roll(TOP, EAST, BOTTOM, WEST);
	}
	public Dice<T> rollEast(){
		return roll(TOP, WEST, BOTTOM, EAST);
	}
	public Dice<T> rollClockWise(){
		return roll(NORTH, WEST, SOUTH, EAST);
	}
	public Dice<T> rollCounterClockWise(){
		return roll(NORTH, EAST, SOUTH, WEST);
	}
	
	public T getTop(){
		return values.get(id[TOP]);
	}
	public T get(int idx){
		return values.get(id[idx]);
	}
	
	public int getId(int face){
		return id[face];
	}
	
	public boolean equalsDirection(Dice<T> d){
		return d.getId(TOP) == getId(TOP) && d.getId(EAST) == getId(EAST);
	}
	

	private Dice<T> roll(int a, int b, int c, int d){
		Dice<T> nd = new Dice<T>(this);
		int tmp = nd.id[a];
		nd.id[a] = nd.id[b];
		nd.id[b] = nd.id[c];
		nd.id[c] = nd.id[d];
		nd.id[d] = tmp;
		return nd;
	}
	public String toString(){
		StringBuilder build = new StringBuilder();
		build.append("TOP:");
		build.append(values.get(id[TOP]));
		build.append(",BOTTOM:");
		build.append(values.get(id[BOTTOM]));
		build.append(",NORTH:");
		build.append(values.get(id[NORTH]));
		build.append(",SOUTH:");
		build.append(values.get(id[SOUTH]));
		build.append(",WEST:");
		build.append(values.get(id[WEST]));
		build.append(",EAST:");
		build.append(values.get(id[EAST]));
		return build.toString();
	}
}