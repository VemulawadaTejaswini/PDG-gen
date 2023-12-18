import java.util.*;
import java.math.*;
import java.lang.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int maxLength = 0;	
		int sum =0;
		for(int i=0;i<n;i++){
			int l = sc.nextInt();
			maxLength = Math.max(l, maxLength);
			sum +=l;
		}

		if(sum-maxLength >maxLength){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}


	}
}
