import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int progA[] = new int[n];
		for(int i = 0; i < n; i++) {
			progA[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		int progB[] = new int[m];
		for(int i = 0; i < m; i++) {
			progB[i] = sc.nextInt();
		}

		boolean flag = false;  //for文をbreakで出たのかどうか判定
		for(int j = 0; j < Math.min(progA.length, progB.length); j++) {
			if(progA[j] > progB[j]) {
				System.out.println(0);
				flag = true;
			}
			else if(progA[j] < progB[j]) {
				System.out.println(1);
				flag = true;
			}
			if(flag == true) break;
		}

		if(flag == false) {  //breakで出ていない場合
			if(progA.length < progB.length) System.out.println(1);
			else System.out.println(0);
		}
	}

}

