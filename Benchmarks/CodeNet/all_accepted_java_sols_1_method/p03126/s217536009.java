import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] suki = new int[m];
		for(int i = 0; i < n; i ++) {
			int k = sc.nextInt();
			for(int j = 0; j < k; j ++) {
				suki[sc.nextInt() - 1] ++;
			}
		}
		sc.close();
		int count = 0;
		for(int i=0; i < m; i ++) {
			if(suki[i] == n) {
				count ++;
			}
		}
		System.out.println(count);

	}
}