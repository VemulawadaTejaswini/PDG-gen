import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			int q = sc.nextInt();
			int b[] = new int[n];
			int c[] = new int[n];
			for(int i = 0; i < q; i++) {
				b[i] = sc.nextInt();
				c[i] = sc.nextInt();
			}
			int sum = 0;
			for(int i = 0; i < q; i++) {
				for(int j = 0; j < a.length; j++) {
					if(a[j] == b[i]) {
						a[j] = c[i];
					}
					sum += a[j];
				}
				System.out.println(sum);
				sum = 0;
			}
	}

}