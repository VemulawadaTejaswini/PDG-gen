import java.util.*;
import java.util.regex.Pattern;
public class Main {
	final int INF = 1 << 24;
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			String [] data = new String[n];
			int index = 0;
			for(int i=0; i < n; i++){
				data[index] = sc.next();
				//duplicate check
				for(int j = index-1 ; j >= 0; j--){
					boolean p1 = Pattern.matches(".*"+data[index]+".*",data[j]);
					boolean p2 = Pattern.matches(".*"+data[j]+".*",data[index]);
					boolean p3 = data[j].equals(data[index]);
					if(p3){
						
					}
					else if(p1){
						index--;
						break;
					}
					else if(p2){
						for(int k = j + 1; k <= index; k++){
							data[k-1] = data[k];
						}
						index--;
					}
				}
				index++;
			}
			n = index;
			int len = 1 << n;
			int [][] dp = new int[n][len];
			String [][] dpStr = new String[n][len];
			for(int i =0; i < n; i++){
				Arrays.fill(dp[i], INF);
				Arrays.fill(dpStr[i], "");
			}
			for(int i = 0; i < n; i++){
				dp[i][1 << i] = data[i].length();
				dpStr[i][1 << i] = data[i];
			}

			for(int i = 0; i <len; i++ ){
				for(int j = 0; j < n;j++){
					if(dp[j][i] == INF) continue;
					for(int k = 0; k < n; k++){
						if((i & (1 << k)) != 0) continue;
						int ind = i | (1 << k);
						int addlen = getlen(data[j],data[k]);
						int klen = data[k].length();
						int value = addlen + dp[j][i];
						if(dp[k][ind] > value){
							dp[k][ind] = value;

							String addStr = data[k].substring(klen - addlen, klen);
							dpStr[k][ind] = dpStr[j][i] + addStr;
						}
						else if(dp[k][ind] != INF && dp[k][ind] == value){
							String addStr = data[k].substring(klen - addlen, klen);
							String nextStr = dpStr[j][i] + addStr;
							if(dpStr[k][ind].compareTo(nextStr) > 0){
								dpStr[k][ind] = nextStr;
							}

						}
					}
				}
			}
			int ans = INF;
			String str = "";
			for(int i=0; i < n; i++){
				if(ans > dp[i][len-1]){
					ans = dp[i][len-1];
					str = dpStr[i][len-1];
				}
				else if(ans != INF && ans == dp[i][len-1]){
					if(str.compareTo(dpStr[i][len-1]) > 0){
						str = dpStr[i][len-1];
					}
				}
			}
			System.out.println(str);

		}
	}
	private int getlen(String a, String b) {
		int res=b.length(),i = 0;
		StringBuilder sb = new StringBuilder();
		for(i=0; i < b.length() && i < a.length();i++){
			sb.append("" + b.charAt(i));
			if(a.endsWith(sb.toString())){
				res = b.length() - i- 1;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}