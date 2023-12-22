import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] c = new int[m][2];
		for(int i = 0; i < m; i++){
		    c[i][0] = sc.nextInt()-1;
		    c[i][1] = sc.nextInt();
		}
		
		// 計算
		int result = -1;
		char[] s = new char[n];
		Arrays.fill(s, '?');
		boolean flg = true;
		for(int i = 0; i < m; i++){
		    if(c[i][0] == 0 && c[i][1] == 0 && n > 1){
		        flg = false;
		        break;
		    }else if(s[c[i][0]] == '?' || s[c[i][0]] - '0' == c[i][1]){
		        s[c[i][0]] = String.valueOf(c[i][1]).charAt(0);
		    }else{
		        flg = false;
		        break;
		    }
		}
		if(flg){
		    if(s[0] == '?' && n > 1) s[0] = '1';
		    String ans = new String(s);
		    System.out.println(ans.replace('?', '0'));
		    return;
		}
		
		// 出力
		System.out.println(result);
	}
}
