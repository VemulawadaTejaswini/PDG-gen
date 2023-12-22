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
		int L = sc.nextInt();
		
		int intArray[] = new int[N];

		int max = 999999999;
		int max_i = 0;
		for(int i = 0 ;i < N;i++){
			intArray[i] = L + (i + 1) - 1;
			if(max > Math.abs(intArray[i])){
				max = Math.abs(intArray[i]);
				max_i = i;
			}
		}
		int min = 0;
		int sum = 0;
		for(int i = 0 ;i < N;i++){
			if(max_i != i ){
				sum += intArray[i];
			}
		}

//		for(int i = 0 ;i < N;i++){
//			int sum = 0;
//			for(int j = 0 ;j < N;j++){
//				if(i != j){
//					sum += intArray[j];
//				}
//			}
//			if(min < Math.abs(max - sum)){
//				min = sum;
//			}
//		}

		System.out.println(sum);


	    
   		sc.close();
        return ;

    }
    
}

