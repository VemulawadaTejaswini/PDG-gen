import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();

		int h[] = new int[n];

		/* 配列に読み込み */
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}

		int i = 1;
		int j = 1;

		while(i < n) {
			if(h[i-1] <= h[i]) {
				i++;
				continue;
			} else {
				if(j > i) {
					System.out.println("No");
					System.exit(0);
				} else {
					i = j++;

					h[i-1]--;

					if(i > 1 && h[i-2] > h[i-1]) {
						h[i-1]++;
					}
				}
			}
		}

		System.out.println("Yes");

        sc.close();
	}
}