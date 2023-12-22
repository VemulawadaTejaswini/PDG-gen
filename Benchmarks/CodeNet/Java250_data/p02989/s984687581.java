import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		
		int ans = 0;
		ArrayList<Integer> intList = new ArrayList<Integer>();

		for (int i = 0; i < N;i ++ ){
			intList.add(sc.nextInt());
		}
		 
		 Collections.sort(intList);
		 
		int tyukan = N / 2;
		if(intList.get(tyukan - 1)==intList.get(tyukan)){
		}else{
			ans = intList.get(tyukan) - intList.get(tyukan - 1); 
		}

		System.out.println(ans);

   		sc.close();
        return ;

    }
    
}

