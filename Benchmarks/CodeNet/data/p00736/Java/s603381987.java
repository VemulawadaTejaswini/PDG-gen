import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			s = in.next().toCharArray();
			if(s[0] == '.') break;
			count = 0;
			table = new int[3];
			dfs(0);
			System.out.println(count);
		}
	}
	public static int count;
	public static char[] s;
	public static int[] table;
	public static void dfs(int dep){
		if(dep == 3){
			idx = 0;
			if(formula() == 2) count++;
			return;
		}
		for(int i=0; i<3; i++){
			table[dep] = i;
			dfs(dep+1);
		}
	}
	
//	public static final String var = "012PQR";
	public static final int[] not = {2, 1, 0};
	public static final int[][] mult = {
		{0, 0, 0},
		{0, 1, 1},
		{0, 1, 2},
	};
	public static final int[][] add = {
		{0, 1, 2},
		{1, 1, 2},
		{2, 2, 2},
	};
	public static int idx;
	public static int formula(){
		if(s[idx] == '-'){
			idx++;
			return not[formula()];
		}
		if(s[idx] == '('){
			idx++;
			int val = formula();
			if(s[idx++] == '+'){
				val = add[val][formula()];
			}else{
				val = mult[val][formula()];
			}
			idx++;
			return val;
		}
		if('0' <= s[idx] && s[idx] <= '2'){
			return s[idx++] - '0';
		}
		return table[s[idx++]-'P'];
	}
}