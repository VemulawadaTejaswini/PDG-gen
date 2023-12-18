import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		String s = sc.next();
		
		// 計算
		String result = "";
		StringBuilder pre = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		for(int i = 0; i < n; i++){
		    if(s.charAt(i) == '('){
		        sb.append('(');
		        cnt++;
		    }else if(s.charAt(i) == ')' && cnt > 0){
		        sb.append(')');
		        cnt--;
		    }else{
		        sb.append(')');
		        pre.append('(');
		    }
		}
		while(cnt > 0){
		    sb.append(')');
		    cnt--;
		}
		result = pre.append(sb).toString();
		
		// 出力
		System.out.println(result);
	}
}
