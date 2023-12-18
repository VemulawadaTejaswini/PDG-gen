//package problem2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main (String args[]) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		//変数宣言
		int input_text_n = Integer.parseInt(scan.nextLine());
		String length = scan.nextLine();
		String[] each_length = length.split(" ");
//		int ans = 0;
		int all_length =0;

		//成立条件
		all_length = triangle_satisfacted_condition(input_text_n,each_length);

//		//combinationの計算
//		if(all_length > 3) {
//			ans = factorialMethod(all_length)
//					/ (6 * factorialMethod(all_length - 3));
//		}
//		else {
//		}

		System.out.println(all_length);
	}

	private static int triangle_satisfacted_condition
	(int input_text_n,String[] pre_length) {
		int all_length = 0;
		int each_length[] = new int[pre_length.length];

		for(int i = 0 ; i < pre_length.length ; i++) {
			each_length[i] = Integer.parseInt(pre_length[i]);
		}
		Arrays.parallelSort(each_length);

		for(int i = 0; i < input_text_n; i++) {
			for(int j = i + 1; j < input_text_n; j++) {
				if(each_length[i]== (each_length[j])) {
					continue;
				}
				for(int k = j+1 ; k < input_text_n; k++) {
					if(( each_length[i]==(each_length[k]))
						||( each_length[j]==(each_length[k]))) {
						continue;
					}
					if(! triangle_condition(each_length[i],each_length[j],each_length[k])) {
						continue;
					}
					all_length ++;
				}
			}
		}
		return all_length;
	}

	private static boolean triangle_condition(int i,int j,int k) {
//		System.out.print(i +" " + j + " "+ k+ " ");
//		if(Integer.parseInt(k) < Integer.parseInt(i) + Integer.parseInt(j)) {
//			System.out.println("OK");
//		}else {
//			System.out.println("");
//		}
		return(k < i + j);
	}

//	private static int factorialMethod(int num) {
//		//階乗の結果を格納
//		int factorial = 1;
//
//		//階乗の計算
//		for (int i = 1; i <= num; i++) {
//			factorial = factorial * i;
//		}
//
//		return factorial;
//	}
}
