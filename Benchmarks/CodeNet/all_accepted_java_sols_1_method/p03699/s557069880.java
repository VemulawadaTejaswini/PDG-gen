import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

		public static void main(String[] args){
			 int sam ;
			 int check ;
			
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			// スペース区切りの整数の入力
			int a = sc.nextInt();

			ArrayList<Integer> stateList = new ArrayList<Integer>();
					
			for (int i = 0; i < a;i ++ ){
				stateList.add(sc.nextInt());
			}
			 
			 Collections.sort(stateList);
			 
			 sam = 0;
			 for(int i=0;i<stateList.size();i++){
				 sam = sam + stateList.get(i);
			 }

			 check = sam  % 10 ;
    		 if(check != 0 ){
	    		// 出力
	    		System.out.println(sam);
	    		return ;
    		 }else{
    			 for(int j=0;j<stateList.size();j++){
    				 int sum2 = sam - stateList.get(j); 
	    			 check = sum2 % 10 ;
	    			 if(check != 0 ){
		        		// 出力
		    	    	System.out.println(sum2);
		    	    	return ;
	    		     }
	    		 }
			 }
			// 出力
			System.out.println(0);
		}
}
