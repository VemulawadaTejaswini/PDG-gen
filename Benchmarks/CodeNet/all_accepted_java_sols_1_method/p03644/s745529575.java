import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Max = 1, MaxValue = 0;
		int count = 0;
		

		for (int i = 1; i <= N; i++) {
			int tempI = i;

			while(true) {
				if (tempI % 2 == 0) {
					++count;
					tempI /= 2;
				}
				else {
					if(MaxValue < count) {
						Max = i;
						MaxValue = count;
						
					}
					break;
				}
			}
			count = 0;

		}
		System.out.println(Max);
	}

}
