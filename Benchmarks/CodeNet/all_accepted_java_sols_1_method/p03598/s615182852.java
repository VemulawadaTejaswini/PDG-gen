import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int [] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		sc.close();

		int ans = 0;
		for(int i=0;i<n;i++) {
			int tmpA = 0;
			tmpA = array[i];
			int tmpB = 0;
			tmpB = k-array[i];
			if(tmpB<0) {
				tmpB = -1*tmpB;
			}
			if(tmpB>=tmpA) {
				ans = ans + 2*tmpA;
			}else {
				ans = ans + 2*tmpB;
			}
		}
		System.out.println(ans);
	}
}