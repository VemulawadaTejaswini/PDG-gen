import java.util.*;

public class Main {

	public static void main(String[] args) {

		//フィールド
		int n = 0;
		int kisu = 0;
		int gusu = 0;

		//入力
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		int intList[] = new int[n];

		for(int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			intList[i] = x;
		}

		for(int i = 0; i < intList.length - 1 ; i++) {
			for(int j = intList.length - 1; j > i; j--) {
				if(intList[j] > intList[j-1]) {
					int x = intList[j-1];
					intList[j-1] = intList[j];
					intList[j] = x;
				}
			}
		}

		for(int i = 0; i < intList.length; i ++) {
			if(i % 2 == 0) {
				gusu = gusu + intList[i];
			}else{
				kisu = kisu + intList[i];
			}
		}

		System.out.println(gusu - kisu);

	}
}
