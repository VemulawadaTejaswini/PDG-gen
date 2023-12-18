import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int d = sc.nextInt();

		int result = 0;
		
		if(d/1000 ==2){
			result++;
		}
		if((d/100)%10 ==2){
			result++;
		}
		if((d%100)/10 ==2){
			result++;
		}
		if(d%10 ==2){
			result++;
		}
		System.out.println(result);



	}
}