import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] a = new int[n];
		int count = 0;

		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
			if((i+1)%2==1&&a[i]%2==1) {
				count++;
			}
		}
		System.out.println(count);

	}

}
