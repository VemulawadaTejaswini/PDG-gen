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
		// その価値での最小の重さを記録する。
		long[] minimumWeightInfo = new long[100000 +1];
		minimumWeightInfo[0] =1;

		for(int i =0;i < productInfo.length;i++) {
			int weight = (int)productInfo[i][0];
			int value = (int)productInfo[i][1];
			for(int j = 100000; j >=0;j--) {
				if(minimumWeightInfo[j] != 0) {
					if(value + j <= 100000) {
						if(j != 0) {
							if(minimumWeightInfo[j + value] ==0) {
								minimumWeightInfo[j + value] = minimumWeightInfo[j] + weight;
							}else {
								if(minimumWeightInfo[j + value] > minimumWeightInfo[j] + weight) {
									minimumWeightInfo[j + value] = minimumWeightInfo[j] + weight;
								}
							}
						}else {
							if(minimumWeightInfo[value] == 0) {
								minimumWeightInfo[value] = weight;
							}else {
								if(minimumWeightInfo[value] > weight) {
									minimumWeightInfo[value] = weight;
								}
							}
						}
					}
				}
			}
		}
		int answer = 0;
		for(int i =1; i <=100000;i++) {
			if(minimumWeightInfo[i] != 0 && minimumWeightInfo[i] <= capacity) {
				if(i > answer) {
					answer = i;
				}
			}
		}
		System.out.println(answer);

	}
}