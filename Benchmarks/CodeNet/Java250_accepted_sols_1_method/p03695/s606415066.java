import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[]k = new int[8];
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			if(a < 400) k[0]++;
			else if(a < 800) k[1]++;
			else if(a < 1200) k[2]++;
			else if(a < 1600) k[3]++;
			else if(a < 2000) k[4]++;
			else if(a < 2400) k[5]++;
			else if(a < 2800) k[6]++;
			else if(a < 3200) k[7]++;
			else cnt++;
		}
		sc.close();
		int t = 0;
		for(int i = 0; i < 8; i++) {
			if(k[i] != 0) {
				t++;
			}
		}
		System.out.println(Math.max(t, 1) +" " + (t + cnt));
	}
}