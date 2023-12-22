import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int  n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		int maxCount = 0;
		int max =0;


		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			list.add(a);
			max = Math.max(max, a);
		}

		for (int i = 0; i < n; i++) {
			int a = list.get(i);
			if(a ==max){
				maxCount++;
			}
		}

		int secondMax = 0;
		if(maxCount == 1){
			for (int i = 0; i < n; i++) {
				int a = list.get(i);
				if(a == max){
					continue;
				}
				secondMax = Math.max(a, secondMax);
			}
		}

		for (int i = 0; i < n; i++) {
			int a = list.get(i);
			if(a == max && maxCount > 1){
				System.out.println(max);
			} else if(a == max && maxCount == 1){
				System.out.println(secondMax);
			} else{
				System.out.println(max);
			}
		}


	}

}
