import java.util.*;

public class Main{
	double p,e,t;
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m) == 0) break;
			String [] data = new String[n];
			for(int i = 0; i < n; i++){
				data[i] = sc.next();
			}
			StringBuilder str = new StringBuilder();
			while(m-- > 0){
				String s = sc.next();
				str.append(s);
			}
			ArrayList<HashSet<Integer>> matchind = new ArrayList<HashSet<Integer>>();
			for(int i = 0; i < n; i++){
				matchind.add(new HashSet<Integer>());
			}
			int len = str.length();
			for(int i = 0; i < len; i++){
				for(int j = 0; j < n; j++){
					if(match(str, i, data[j])){
						matchind.get(j).add(i);
					}
				}
			}
			boolean [][] dp = new boolean[1 << n][len + 1];
			
			
			for(int i = 0; i < len; i++){
				for(int j = 0;j < n; j++){
					if(matchind.get(j).contains(i) == false) continue;
					dp[0][i] = true;
					for(int k = 0; k < (1 << n); k++){
						if(dp[k][i] == false) continue;
						if((k & (1 << j)) > 0) continue;
						int nextbit = (k | (1 << j));
						int nexti = i + data[j].length();
						//debug(nextbit, nexti, i,j,k);
						dp[nextbit][nexti] = true;
					}
				}
			}
			int count = 0;
			for(int i = 0; i <= len;i++){
				if(dp[(1 << n) - 1][i]){
					count++;
				}
			}
			System.out.println(count);
		}
	}

	private boolean match(StringBuilder str, int ind, String patt) {
		if(str.length() - ind < patt.length()){
			return false;
		}
		for(int i = 0; i < patt.length(); i++){
			if(str.charAt(i +  ind) != patt.charAt(i)){
				return false;
			}
		}
		return true;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}