
import java.util.*;
import java.awt.geom.*;
public class Main {
	//1500 start
	//1732 sample match AC
	
	class C{
		Integer [][] data;
		int step,ind;
		int [] gapx, gapy;
		public C(Integer[][] data, int step, int[] gapx, int[]gapy,int ind) {
			this.data = data;
			this.step = step;
			this.gapx = gapx;
			this.gapy = gapy;
			this.ind = ind;
		}
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		int dataset = sc.nextInt();
		while(dataset-- > 0){
			Integer [][] data = new Integer[4][8];
			for(int i = 0 ; i < 4; i++){
				data[i][0] = -1;
				for(int j = 1 ; j< 8; j++){
					data[i][j] = sc.nextInt();
				}
			}
			int [] gapx = new int[4], gapy = new int[4];
			int gapind = 0;
			for(int i = 0 ; i < 4; i++){
				for(int j = 1; j < 8; j++){
					if(data[i][j] % 10 == 1){
						int ind = data[i][j] / 10 - 1;
						swap(data, ind, 0, i, j);
						gapx[gapind] = j; gapy[gapind] = i;
						gapind++;
					}
				}
			}
			//check
			boolean res = check(data);
			if(res){
				System.out.println(0);
			}
			else{
				System.out.println(solve(data, gapx, gapy));
			}
		}
	}

	private int solve(Integer [][] d, int [] gapx_, int [] gapy_) {
		LinkedList<C> open = new LinkedList<C>();
		open.add(new C(d, 0, gapx_, gapy_, -1));
		HashMap<String, Integer> close = new HashMap<String, Integer>();
		close.put(tostr(d), 0);
		
		int ans = -1;
		while(! open.isEmpty()){
			C now = open.removeFirst();
			if(check(now.data)){
				ans = now.step;
				break;
			}
			for(int i = 0; i < 4; i++){
				int x =now.gapx[i];
				int y = now.gapy[i];
				if(now.data[y][x-1] == -1 || now.data[y][x-1] % 10 == 7) continue;
				//if(now.ind == i) continue;
				
				int [] res = find(now.data[y][x-1] + 1, now.data);
				if(res[0] == -1)  continue;
				
				Integer [][] next = deepcopy(now.data);
				swap(next, y, x, res[0], res[1]);
				String s = tostr(next);
				if(close.containsKey(s) && close.get(s) <= now.step + 1){
					continue;
				}

				int [] nextx = Arrays.copyOf(now.gapx, 4);
				int [] nexty = Arrays.copyOf(now.gapy, 4);
				nextx[i] = res[1];
				nexty[i] = res[0];
				open.add(new C(next, now.step + 1, nextx, nexty, i));
				close.put(s, now.step + 1);
			}
		}
		return ans;
	}

	private String tostr(Integer[][] d) {
		StringBuilder sb = new StringBuilder();
		for(int  i = 0; i < 4; i++){
			for(int j = 0; j < 8; j++){
				sb.append(d[i][j] + " ");
			}
		}
		return sb.toString();
	}

	private Integer[][] deepcopy(Integer[][] data) {
		Integer [][] data2 = new Integer[4][8];
		for(int i = 0 ; i < 4; i++){
			for(int j = 0 ; j < 8; j++){
					data2[i][j] = data[i][j];
			}
		}
		return data2;
	}

	private int[] find(int num, Integer [][] data) {
		for(int i = 0; i < 4; i++){
			for(int j = 1 ; j < 8; j ++){
				if(data[i][j] == num){
					int [] res = {i,j};
					return res;
				}
			}
		}
		int [] not = {-1,-1};
		return not;
	}

	private boolean check(Integer[][] data) {
		for(int i =0; i < 4; i++){
			int checknum = (i+1) * 10 + 1;
			for(int j = 0; j < 7; j++){
				if(data[i][j] == checknum){
					checknum++;
				}
				else{
					return false;
				}
			}
		}
		return true;
	}

	private void swap(Integer[][] data, int ind, int j, int i2, int j2) {
		int temp = data[ind][j];
		data[ind][j] = data[i2][j2];
		data[i2][j2] = temp;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}