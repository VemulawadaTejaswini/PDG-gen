

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] c = new int[100010];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i : arr) {
			if(c[i] != 0) {
				c[i] = 2;
				continue;
			}
				for(int j = i; j < 100010; j += i) c[j]++;
			}
		int cnt = 0;
		for(int i : arr) {
			if(c[i] == 1) cnt++;
		}
		System.out.println(cnt);
	}

}
