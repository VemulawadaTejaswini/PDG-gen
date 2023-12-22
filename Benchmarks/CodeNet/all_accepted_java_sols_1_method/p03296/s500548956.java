import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sum = 0;
		int i;
		int[] a;
		a = new int[n];
		for(i=0;i<n;i++) a[i] = sc.nextInt();

		for(i=1;i<n;i++) {
			if(a[i]==a[i-1]) {
				a[i] = -1;
				sum++;
				i++;
			}
		}
		System.out.println(sum);

	}

}