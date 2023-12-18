import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			// スペース区切りの整数の入力
			int N = sc.nextInt();
			// 整数の入力
			// スペース区切りの整数の入力
			int K = sc.nextInt();


			ArrayList<Integer> stateList = new ArrayList<Integer>();
					
			for (int i = 0; i < N;i ++ ){
				// 整数の入力
				// スペース区切りの整数の入力
				stateList.add(sc.nextInt());
			}
			 
			Collections.sort(stateList);

			int sum = 0;
			int j = N - K  ;
			for(int i= j ;i < N ;i++){
					
				sum = sum + stateList.get(i);
	        	//System.out.println(stateList.get(i));
			}

       		// 出力
        	System.out.println(sum);
		}
}
