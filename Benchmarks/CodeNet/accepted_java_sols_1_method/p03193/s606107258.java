import java.util.Scanner;
public class Main {
	static int[] Shichigo = new int[1100000];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(),H = sc.nextInt(),W = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		int cnt = 0;
		for(int i = 0;i < N;i ++) {
			a[i] = sc.nextInt(); b[i] = sc.nextInt();
			if(a[i] >= H && b[i] >= W) cnt++;
		}
		System.out.println(cnt);
	}
}