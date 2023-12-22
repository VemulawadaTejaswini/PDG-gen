import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), c = sc.nextInt();
		int[] b = new int[m];
		for(int i = 0;i < m;i ++) {
			b[i] = sc.nextInt();
		}
		int sum = 0,a = 0,cnt = 0;
		for(int i = 0;i < n;i ++) {
			sum = 0;
			for(int k = 0;k < m;k++) {
				a = sc.nextInt();
				sum += a * b[k];
			}
			sum += c;
			if(sum > 0) cnt++;
		}
		System.out.println(cnt);
	}
}