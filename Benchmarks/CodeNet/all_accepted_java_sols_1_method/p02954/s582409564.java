import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 文字列の入力
		String str = sc.next();
		char c[] = str.toCharArray();
		int len = c.length;
		int[] a = new int[len];
		int[] n = new int[len];
		int[] n2 = new int[len];

		int j, cnt;

		for(int i = 0; i < len; i++) {
			n[i] = 0;
		}

		for(int i = 0; i < len-1; i++) {
			if(c[i]=='R' && c[i+1]=='L') {
				n[i] = 1;
				n[i+1] = 1;

				j = i-1;
				while(j >= 0 && c[j] == 'R') {
					j--;
				}

				if((i-j-1) % 2 == 0) {
					n[i] += (i-j-1)/2;
					n[i+1] += (i-j-1)/2;
				} else {
					n[i] += (i-j-1)/2;
					n[i+1] += (i-j-1)/2+1;
				}

				j = i+1;
				while(j < len && c[j] == 'L') {
					j++;
				}

				if((j-i-2) % 2 == 0) {
					n[i] += (j-i-2)/2;
					n[i+1] += (j-i-2)/2;
				} else {
					n[i] += (j-i-2)/2+1;
					n[i+1] += (j-i-2)/2;
				}
			}
		}

		/* 配列に読み込み */
		/*
		for(int i = 0; i < len; i++) {
			a[i] = c[i] == 'L' ? -1 : 1;
			n[i] = 1;
		}

		for(int i = 0; i < ((len % 2 == 0) ? len : len+1); i++) {

			if(i % 2 == 0) {
				for(int j = 0; j < len; j++) {
					n2[j] = 0;
				}

				for(int j = 0; j < len; j++) {
					n2[j+a[j]] += n[j];
				}
			} else {
				for(int j = 0; j < len; j++) {
					n[j] = 0;
				}

				for(int j = 0; j < len; j++) {
					n[j+a[j]] += n2[j];
				}
			}
		}*/

		for(int i = 0; i < len; i++) {
			System.out.print(n[i]+ " ");
		}

        sc.close();
	}
}