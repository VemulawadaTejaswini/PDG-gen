import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		char[] s = S.toCharArray();
		char[] t = T.toCharArray();
		int slen = s.length;
		int tlen = t.length;
		
		//答えansを仮置きする。
		//これが十分に大きくないと不正解となるので、
		//この値なら絶対に正しい答えが出る、という値を仮置きすること
		int ans = tlen;
		
		for(int start = 0; start <= slen-tlen; start++){
			int diff = 0;
			for(int i = 0; i < tlen; i++){
				if(t[i] != s[start+i]){
					diff++;
				}
			}
			ans = Math.min(ans, diff);
		}
		
		System.out.println(ans);
	}
}