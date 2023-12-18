import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		String s = new String();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		long cnt= 0;
        for(int i = 0; i < n; i++){
            s = sc.next();
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String s2 = new String(chars);
            if(map.containsKey(s2)){
                Integer j = map.get(s2);
                cnt = cnt + j;
                map.put(s2, j + 1);
            }else{
                map.put(s2, 1);
            }
        }        
		
		// 計算

		// 出力
        System.out.println(cnt);
		
	}
}
