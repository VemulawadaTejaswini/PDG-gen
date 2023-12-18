import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int a[] = new int[n];

		for(int i = 0; i < n; i++){
			a[i] = in.nextInt();
		}
		System.out.print(a[n]);
		for(n = n - 2; n >= 0; n--){
			System.out.print(" " + a[n]);
		}

	}

}

