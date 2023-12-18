import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();

		ArrayList<Integer> ls4 = new ArrayList<Integer>();

		for (int i = 0; i < N;i ++ ){
			// 重りを入力
			ls4.add( sc.nextInt());
		}

		int ans_a = 0;
		int ans_b = 0;//合計
		int T = 0;
		int min = 999999999;
		int ans = 0;
		
		while (T < N) {
			for (int i = 0; i < N;i ++ ){
				if(i < T){
					ans_a = ans_a + ls4.get(i);
				}else{
					ans_b = ans_b + ls4.get(i);
				}
			}
			if(min > Math.abs(ans_a - ans_b)){
				min = Math.abs(ans_a - ans_b);
				ans = T;
			}
			T ++;
			ans_a = 0;
			ans_b = 0;
		}
	    
		System.out.println(min);

   		sc.close();
        return ;

    }
    
}

