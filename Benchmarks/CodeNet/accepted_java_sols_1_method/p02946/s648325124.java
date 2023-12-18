import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力

		int k = sc.nextInt();
		int x = sc.nextInt();

		int left = 0;
		int right = 0;

		if(1000000 < x+k-1){
			right = 1000000;
			left = 1000000-k;
		}else if (-1000000 > x-k+1){
			right = -1000000 + k ;
			left = -1000000;
		}else{
			right = x+k-1 ;
			left = x-k+1;			
		}
		

		for (int i = left; i <= right; i++) {
			System.out.println(i);
		}
	}
}
