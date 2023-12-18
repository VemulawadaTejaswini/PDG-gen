
import java.util.*;
public class Main {
	String [] list;
	boolean flg = true;
	boolean [] used;
	int n;
	int [][] pass2;
	

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			if(n == 0) break;
			int [] in = new int[26];
			int [] out = new int[26];
			list = new String[n];
			pass2 = new int[26][26];
			
			for(int i = 0 ; i < n; i++){
				String s = sc.next();
				list[i] = s;
				in[s.charAt(0) - 'a']++;
				out[s.charAt(s.length() - 1) - 'a' ]++;
				int from = s.charAt(0) - 'a';
				int to =  s.charAt(s.length() - 1) - 'a';
				pass2[from][to]++;
				pass2[to][from]++;
			}
			boolean res = isOK(in, out);
			System.out.println(res ? "OK" : "NG");
		}
	}
	
	private boolean isOK(int[] in, int[] out) {
		for(int i = 0 ; i < in.length;i++){
			if(in[i] != out[i]) return false;
		}
		
		flg = false;
		used = new boolean[26];
		int ind = 0;
		for(ind = 0; ind < 26; ind++){
			if(in[ind] > 0){
				break;
			}
		}
		dfs(ind);
		for(int i = 0 ; i < 26; i++){
			for(int j = 0 ; j < 26; j++){
				if(pass2[i][j] > 0){
					return false;
				}				
			}
		}
		
		return true;
	}
	private void dfs(int now) {
		for(int i = 0 ; i < 26; i++){
			if(pass2[now][i] > 0){
				pass2[now][i]--;
				pass2[i][now]--;
				dfs(i);
			}
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}