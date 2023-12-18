import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int num[] = new int[3];
		for(int i = 0; i < 3;i++) {
			num[i] = sc.nextInt();
		}
		for(int i = 0;i < 3;i++) {
			for(int j = i+1;j < 3;j++) {
				if(num[i] < num[j]) {
				int tmp = num[i];
				num[i] = num[j];
				num[j] = tmp;
			}
			}
		}
		int ans = num[0] * 10 + num[1] + num[2];
		System.out.println(ans);
	}
}
