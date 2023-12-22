import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner src = new Scanner(System.in);
		int answer = 0;
		int[] value = {500, 100, 50, 10, 5, 1};
		int[] coin = new int[1000];
		int count = 0;
		for(int i = 0;; i++) {
			int temp = src.nextInt();
			if(temp == 0)	break;
			coin[i] = 1000 - temp;
			count++;
		}


		//	コインの枚数
		for(int j = 0; j < count; j++) {
			int t = coin[j];
			for(int i = 0; i < value.length; i++) {
				int n;
				if(coin[j] / value[i] > 0) {
					//	coin[i]で支払いができるとき
					n = t / value[i];
					t -= n * value[i];
				}else {
					// coin[i]で支払いが無理なとき
					continue;
				}
				answer += n;
			}
			System.out.println(answer);
			answer = 0;
		}
	}
}
