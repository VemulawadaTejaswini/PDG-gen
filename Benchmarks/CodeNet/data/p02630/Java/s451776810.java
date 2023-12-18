import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numberInfo = new int[100000 +1];
		long total = 0;
		for(int i =0;i < n;i++) {
			int tmp = sc.nextInt();
			numberInfo[tmp]++;
			total+= tmp;

		}
		int q = sc.nextInt();
		for(int i = 0; i < q; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			total += (c -b) * numberInfo[b];
			System.out.println(total);
			numberInfo[c] += numberInfo[b];
			numberInfo[b] = 0;
		}
	}
}
