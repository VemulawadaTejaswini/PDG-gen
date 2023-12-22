import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
		int[] result = new int[s.length()];
		char c = 'R';
		int cnt = 1;
		for(int i = 0; i < s.length(); i++){
		    if(i == 0){
		        c = s.charAt(i);
		    }else if(c == s.charAt(i)){
		        cnt++;
		    }else{
		        result[i-1] += (cnt+1)/2;
		        result[i] += cnt/2;
		        cnt = 0;
		    }
		}
		cnt = 1;
		for(int i = s.length()-1; i >= 0; i--){
		    if(i == s.length()-1){
		        c = s.charAt(i);
		    }else if(c == s.charAt(i)){
		        cnt++;
		    }else{
		        result[i+1] += (cnt+1)/2;
		        result[i] += cnt/2;
		        cnt = 0;
		    }
		}
		
		// 出力
		for(int i = 0; i < s.length(); i++){
		    System.out.print(result[i] + " ");
		}
	}
}
