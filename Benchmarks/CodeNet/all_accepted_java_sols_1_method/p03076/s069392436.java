import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int[] dish = new int[5];
		for(int i = 0; i < 5; i++){
		    dish[i] = sc.nextInt();
		}
		
		// 計算
		int result = 0;
		int rest = 10;
		int index = 0;
		for(int i = 0; i < 5; i++){
		    if(rest > dish[i]%10 && dish[i]%10 > 0){
		        rest = dish[i]%10;
		        index = i;
		    }
		}
		for(int i = 0; i < 5; i++){
		    if(i != index) result += ((dish[i] + 9)/10)*10; 
		}
		result += dish[index];
		
		// 出力
		System.out.println(result);
        
	}
}