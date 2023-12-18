import java.util.*;
public class Main {
	public static int[][] typeitem;
	public static int[] itemval;
	public static int[] val;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while (true) {
			int n = stdIn.nextInt();
			if(n == 0) {
				break;
			}
			String[] AT = new String[n]; //アイテム名とIDの対応の格納
			val = new int[n]; //各IDの価格
			typeitem = new int[n][0];
			for(int i = 0; i < n; i++) {
				String tmp22 = stdIn.next();
				AT[i] = tmp22;
				val[search(AT,tmp22)] = stdIn.nextInt(); 
			}
			
			int suma = stdIn.nextInt();
			
			for(int i = 0; i < suma; i++) {
				int idx0 = search(AT,stdIn.next());
				int nums = stdIn.nextInt();
				typeitem[idx0] = new int[nums];
				for(int j = 0; j < nums; j++) {
					typeitem[idx0][j] = search(AT,stdIn.next());
				}
			}
			int seaID = search(AT,stdIn.next());
			
			int ans = dfs(seaID);
			
			System.out.println(ans);
		}
		
		
		
		
	}
	
	public static int search(String[] id, String tmp) {
		for(int i = 0; i < id.length; i++) {
			if(id[i].equals(tmp)) {
				return i;
			}
		}
		return 0;
	}
	
	public static int dfs(int id) {
		int ALc = 0;
		if(typeitem[id].length == 0) {
			return val[id]; 
		}
		for(int i = 0; i < typeitem[id].length; i++) {
			ALc += dfs(typeitem[id][i]);
		}
		
		if(val[id] > ALc) {
			return ALc;
		}
		return val[id];
	}
}