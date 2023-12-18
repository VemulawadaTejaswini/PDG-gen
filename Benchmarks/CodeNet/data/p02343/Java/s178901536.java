import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputed[] = new String[2];
		String command[] = new String[3];

		StringBuilder ans = new StringBuilder();

		try {
			inputed = br.readLine().split("\\s+");
			int N = Integer.parseInt(inputed[0]);
			int Q = Integer.parseInt(inputed[1]);

			UnionFind unionTree = new UnionFind(N);
			unionTree.init();

			for(int loop = 0; loop < Q; loop++){
				command = br.readLine().split("\\s+");
				if(command[0].equals("0")){ //unite
					unionTree.unite(Integer.parseInt(command[1]),Integer.parseInt(command[2]));
				}else{
					if(unionTree.is_same(Integer.parseInt(command[1]), Integer.parseInt(command[2]))){
						ans.append("1\n");
					}else{
						ans.append("0\n");
					}
				}
			}

			System.out.print(ans.toString());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class UnionFind{
	private int boss[];
	private int height[];
	private int size;

	UnionFind(int size){
		boss = new int[size];
		height = new int[size];
		this.size = size;
	}

	public void init(){
		for(int i = 0; i < size; i++){
			boss[i] = i;
			height[i] = 0;
		}
	}

	public int get_boss(int id){
		if(boss[id] == id)return id; //自分が代表なら、自分の値を返す
		else{
			return boss[id] = get_boss(boss[id]); //代表でないなら、自分が所属する組織の代表を返しつつ、経路圧縮
		}
	}

	public boolean is_same(int x,int y){
		return get_boss(x) == get_boss(y);
	}

	void unite(int x,int y){
		int boss_x = get_boss(x);
		int boss_y = get_boss(y);

		//既に同じグループなら何もしない
		if(boss_x == boss_y)return;

		//高さが高い方に吸収する
		if(height[x] > height[y]){

			boss[boss_y] = boss_x;

		}else if(height[x] < height[y]){

			boss[boss_x] = boss_y;

		}else{ //height[x] == height[y]

			boss[boss_y] = boss_x;
			height[x]++;
		}
	}
}


