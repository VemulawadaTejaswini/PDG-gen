import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int maxW = sc.nextInt();
		int weight[] = new int[num];
		int value[] = new int[num];
		for(int i = 0; i < num; i ++) {
			weight[i] = sc.nextInt();
			value[i] = sc.nextInt();
		}

		int maxValue = 0;
		for(int i = 0; i < num; i ++) {
			maxValue += value[i];
		}

		long dpWeight[][] = new long[num + 1][maxValue + 1];
		long dpMin[][] = new long[num + 1][maxValue + 1];

		for(int j = 0; j <= maxValue; j ++) {
			dpWeight[0][j] = Long.MAX_VALUE;
			dpMin[0][j] = Long.MAX_VALUE;
		}
		for(int i = 0; i <= num; i ++) {
			dpWeight[i][0] = 0;
			dpMin[i][0] = 0;
		}

		for(int j = 1; j <= maxValue; j ++) {
			long min2 = Long.MAX_VALUE;
			for(int i = 1; i <= num; i ++) {
				min2 = Math.min(min2, dpWeight[i - 1][j]);
				dpMin[i][j] = min2;
				if(j - value[i - 1] < 0) {
					dpWeight[i][j] = min2;
				}else {
					long min = dpMin[i][j - value[i - 1]];
					if(min == Long.MAX_VALUE) {
						dpWeight[i][j] = min2;
					}else {
						dpWeight[i][j] = Math.min(min + weight[i - 1], min2);
					}
				}
			}
		}

		long max = 0;
		for(int i = 0; i <= num; i ++) {
			for(int j = maxValue; j >= 0; j --) {
				if(dpWeight[i][j] <= maxW) {
					max = j;
					break;
				}
			}
		}
		
		System.out.println(max);
	}
}