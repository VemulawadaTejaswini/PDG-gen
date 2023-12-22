

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int t = sc.nextInt();

		int a[] = new int[n];

//		int min = Integer.MAX_VALUE;
//		int max = 0;
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
//			min = Math.min(min, a[i]);
//			max = Math.max(max, a[i]);
		}

//		int maxBenefit = max - min;
//
		int min = a[0];
//		int max = a[0];
		int maxBenefit = 0;
		for(int i = 1; i < n; i++){
			min = Math.min(min, a[i]);
//			max = Math.max(max, a[i]);
			maxBenefit = Math.max(maxBenefit, a[i] - min);
		}

//		System.out.println(maxBenefit);

		int minNum = 1;
		int maxNum = 0;
		min = a[0];
		int result = 0;
		for(int i = 1; i < n; i++){
			if(a[i] == min){
				minNum++;
			}
			if(a[i] == min + maxBenefit){
				maxNum++;
			}

			if(a[i] < min || i == n - 1){
				min = a[i];

				result += Math.min(minNum, maxNum);

				minNum = 1;
				maxNum = 0;
			}

//			System.out.println("i = "+i+" minNum = "+minNum+" maxNum = "+maxNum);
		}

		System.out.println(result);
	}

}
