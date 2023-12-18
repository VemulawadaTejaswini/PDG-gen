import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int capacity = sc.nextInt();
		long[][] productInfo = new long[n][2];
		for(int i = 0;i < n;i++) {
			// 重さ
			productInfo[i][0] = sc.nextInt();
			// 価値
			productInfo[i][1] = sc.nextInt();
		}
		// その重さでの最大の価値を記録する。
		long[] maxValueInfo = new long[capacity +1];
		maxValueInfo[0] =1;

		for(int i =0;i < productInfo.length;i++) {
			int weight = (int)productInfo[i][0];
			int value = (int)productInfo[i][1];
			for(int j = capacity; j >=0;j--) {
				if(maxValueInfo[j] != 0) {
					if(j + weight <= capacity) {
						if(j != 0) {
							if(maxValueInfo[j + weight] < maxValueInfo[j] + value) {
								maxValueInfo[j + weight] = maxValueInfo[j] + value;
							}
						}else {
							if(maxValueInfo[weight] < value) {
								maxValueInfo[weight] = value;
							}
						}
					}
				}
			}
		}
		long answer = 0;
		for(int i =1; i <= capacity; i++) {
			if(maxValueInfo[i] > answer) {
				answer = maxValueInfo[i];
			}
		}
		System.out.println(answer);

	}
}