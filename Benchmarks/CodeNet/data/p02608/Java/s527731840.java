import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[] map = new int[100001];
		for (int i = 1; i < 60; i++) {
			for (int j = 1; j < 60; j++) {
				for (int k = 1; k < 60; k++) {
					int n = i*i + j*j + k*k + i*j + i*k + j*k;
					if (n < 100001) {
						map[n]+=1;
					}
				}
			}
		}
		for (int i = 1; i <= m; i++) {
			System.out.println(map[i]);
		}

	}

}
