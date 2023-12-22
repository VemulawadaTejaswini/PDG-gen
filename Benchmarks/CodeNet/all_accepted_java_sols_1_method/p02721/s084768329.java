import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int c = sc.nextInt();
		String s = sc.next();
		
		// 計算
		long result = 0;
		int[] forward = new int[n];
		int[] backward = new int[n];
		int cnt = 0;
		for(int i = 0; i < n; i++){
		    if(cnt == k) break;
		    if(s.charAt(i) == 'o'){
		        cnt++;
		        forward[i] = cnt;
		        i += c;
		    }
		}
		cnt = 0;
		for(int i = 0; i < n; i++){
		    if(cnt == k) break;
		    if(s.charAt(n-i-1) == 'o'){
		        cnt++;
		        backward[n-i-1] = k+1 - cnt;
		        i += c;
		    }
		}
		//System.out.println(Arrays.toString(forward));
		//System.out.println(Arrays.toString(backward));

		// 出力
		for(int i = 0; i < n; i++){
		    if(forward[i] != 0 && forward[i] == backward[i]) System.out.println(i+1);
		}
	}
}

