import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max_size = 300001;
		int[] ms = new int[max_size];
		for(int i = 6; i < max_size; i++) {
			if(ms[i] == 0 && (i % 7 == 1 || i % 7 == 6)) {
				ms[i] = 1;/* 月土素数 */
				for(int j = i * 2; j < max_size; j+=i) {
					ms[j] = 2;/* 倍数 */
				}
			}
		}
		
		while(true) {
			int n = sc.nextInt();
			if(n == 1) break;
			
			System.out.print(n + ":");
			for(int i = 6; i < n + 1; i++) {
				if(ms[i] == 1 && n % i == 0) {
					System.out.print(" " + i);
				}
			}
			System.out.println();
		}
	}

}

