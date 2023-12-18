import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 標準入力からデータを読み込む準備
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] a = new int[N];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		 }		

		for (int i = a.length-1; i >= 0; i--) {
			if(i!=0)
				System.out.printf("%d ",a[i]);
			else
				System.out.printf("%d",a[i]);

		 }		

		System.out.println();

		sc.close();
	}

}

