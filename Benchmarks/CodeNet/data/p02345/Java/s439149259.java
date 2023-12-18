import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n; //数列要素数
		int q; //クエリの数
		int com;//クエリタイプ
		int x;
		int y;
		n = scan.nextInt();
		q = scan.nextInt();
		int a[] = new int[n];
		int min;
		//初期化
		for (int i = 0; i < n; i++) {
			a[i] = (int) (Math.pow(2, 31) - 1);
		}
		for (int i = 0; i < q; i++) {
			com = scan.nextInt();
			x = scan.nextInt();
			y = scan.nextInt();
			if (com == 0) {
				if (x < a.length) {
					//update
					a[x] = y;
				}
			} else if (com == 1 ) {
				//find
				min = (int) (Math.pow(2, 31) - 1);
				for (int j = x; j <= y; j++) {
					if (j == x) {
						min = a[j];
					} else if (a[j] < min) {
						min = a[j];
					}
				}
				System.out.println(min);
			}
		}
		scan.close();
	}
}
