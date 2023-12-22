

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		sc.close();

		int N = s.length();
		int[] res = new int[N + 2];

		boolean lastTile = true;	//Rはtrue
		int n = 1;
		int lastRIndex = 0;
		for(int i = 1;i <= N - 1;i++) {
//			System.out.println(s.charAt(i));
			if(lastTile) {
				if(s.charAt(i) == 'R') {
					n++;
				}else {
//					System.out.println("a i:" + i);
//					System.out.println("a n:" + n);
					res[i - 1] += (n + 1) / 2;
					res[i] += n / 2;
					n = 1;
					lastTile = false;
					lastRIndex = i - 1;
				}
			}else {
				if(s.charAt(i) == 'L') {
					n++;
				}else {
//					System.out.println("b i:" + i);
					res[lastRIndex] += n / 2;
					res[lastRIndex + 1] += (n + 1) / 2;
					n = 1;
					lastTile = true;
				}
			}
		}
		res[lastRIndex] += n / 2;
		res[lastRIndex + 1] += (n + 1) / 2;

		for(int i = 0;i <= N - 2;i++) {
			System.out.print(res[i] + " ");
		}
		System.out.println(res[N - 1]);


	}
}
