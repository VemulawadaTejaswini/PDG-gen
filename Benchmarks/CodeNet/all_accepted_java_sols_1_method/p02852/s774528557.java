import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		String s = sc.next();

		// 計算
		ArrayList<Integer> result = new ArrayList<Integer>();
		int now = s.length() - 1;
		boolean can = true;
		while(now > 0 && can){
		    can = false;
		    for(int i = 0; i < m; i++){
		        int index = max(0, now - (m - i));
		        if(s.charAt(index) == '0'){
		            result.add(now - index);
		            now = index;
		            can = true;
		            break;
		        }
		    }
		}
		if(now != 0){
		    System.out.println(-1);
		    return;
		}
		
		// 出力
		for(int i = result.size() - 1; i >= 0; i--){
		    System.out.print(result.get(i) + " ");
		}
	}
}
