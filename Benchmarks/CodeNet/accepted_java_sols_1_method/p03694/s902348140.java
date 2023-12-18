import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

		public static void main(String[] args){
			 int sum ;
			
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			// スペース区切りの整数の入力
			int a = sc.nextInt();

			ArrayList<Integer> stateList = new ArrayList<Integer>();
					
			for (int i = 0; i < a;i ++ ){
				stateList.add(sc.nextInt());
			}
			 
			 Collections.sort(stateList);
			 
			 sum = stateList.get(a-1) - stateList.get(0);
			 
    		 // 出力
			System.out.println(sum);
		}
}
