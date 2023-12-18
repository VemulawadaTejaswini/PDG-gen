/**
 * 
 */
import java.util.*;
/**
 * @author akira
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		int n, m;
		while(true){
			n = scan.nextInt();
			if(n == 0){
				break;
			}
			int[][] edge = new int[n][n];
			m = scan.nextInt();
			for(int i = 0;i < n;i++){
				for(int j = 0;j < n;j++){
					edge[i][j] = -1;
				}
			}
			scan.nextLine();
			for(int i = 0;i < m;i++){
				String str = scan.nextLine();
				int a, b, d;
				a = Integer.parseInt(str.substring(0,str.indexOf(",")));
				str = str.substring(str.indexOf(",") + 1,str.length());
				b = Integer.parseInt(str.substring(0,str.indexOf(",")));
				str = str.substring(str.indexOf(",") + 1,str.length());
				d = Integer.parseInt(str);
				edge[a][b] = d;
				edge[b][a] = d;
			}
			set.clear();
			int[] mindis = new int[n];
			for(int i = 0;i < n;i++){
				mindis[i] = edge[0][i];
			}
			set.add(0);
			int ans = 0;
			while(set.size() < n){
				int id = -1;
				for(int i = 0;i < n;i++){
					if(!set.contains(i) && mindis[i] != -1 && (id == -1 || mindis[i] < mindis[id])){
						id = i;
					}
				}
				set.add(id);
				ans += mindis[id] / 100 - 1;
				for(int i = 0;i < n;i++){
					if(mindis[i] == -1 || edge[id][i] == -1){
						mindis[i] = Math.max(edge[id][i],mindis[i]);
					}else if(edge[id][i] != -1){
						mindis[i] = Math.min(edge[id][i],mindis[i]);
					}
				}
			}
			System.out.println("" + ans);
		}
	}

}