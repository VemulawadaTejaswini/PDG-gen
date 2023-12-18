import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = 3;

		// Mapの宣言
        Map<Integer, Integer> mMap = new HashMap<Integer, Integer>();
        
		for (int i = 0; i < N;i ++ ){
			// 年、点数の入力
			mMap.put( sc.nextInt(),i+1);
		}

		// キーでソートする
        Object[] mapkey = mMap.keySet().toArray();
        Arrays.sort(mapkey);
        
        int cnt = 0;
        int ans = 0;
        for (Object nKey : mapkey)
        {
//            System.out.println(nKey);
//            System.out.println(mMap.get(nKey));
            cnt ++;
//            System.out.println(mMap.get(nKey));
//            System.out.println(nKey);
            ans = ans + Integer.parseInt(nKey.toString());
            if (cnt == 2){
            	break;
            }
        }
        if(cnt == 1){
        	ans = ans * 2;
        }
		
		
		System.out.println(ans);

   		sc.close();
        return ;

    }
    
}

