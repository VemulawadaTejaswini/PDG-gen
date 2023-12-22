import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
		int result = Integer.MAX_VALUE;
		boolean isZero = false;
		ArrayList<Integer> list = new ArrayList<Integer>();
		int cnt = 0;
		int sum = 0;
		for(int i = 0; i < s.length(); i++){
		    if(i == 0){
		        if(s.charAt(i) == '0') isZero = true;
		    }
		    if((s.charAt(i) == '0' && isZero)||(s.charAt(i) == '1' && !isZero)){
		        cnt++;
		    }else{
		        list.add(cnt);
		        sum += cnt;
		        cnt = 1;
		        isZero = !isZero;
		    }
		}
		list.add(cnt);
		sum += cnt;
		if(list.size() == 1){
		    result = list.get(0);
		}else{
		    int temp = 0;
		    for(int i = 0; i < list.size(); i++){
		        temp += list.get(i);
		        result = min(result, max(sum - temp, temp));
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}

