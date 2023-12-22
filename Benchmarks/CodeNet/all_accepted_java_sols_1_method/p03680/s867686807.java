import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

		public static void main(String[] args){
			 
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			// スペース区切りの整数の入力
			int N = sc.nextInt();

			ArrayList<Integer> stateList = new ArrayList<Integer>();

			stateList.add(N);
					
			for (int i = 1; i <= N;i ++ ){
				stateList.add(sc.nextInt());
			}
			
            int ai= 1;		
            int j = 0;
			for(int i=1;i <= stateList.size();i++){
				ai = stateList.get(ai);
				j ++;
				if(ai == 2){
		       		// 出力
		        	System.out.println(j);
		        	return ;
				}
    		 }

    		 // 出力
			System.out.println("-1");
		}
}
