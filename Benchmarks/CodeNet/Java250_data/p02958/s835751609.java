import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String s = sc.nextLine();
		String[] spl = s.split(" ");
		int[] p = new int[N];
		for(int i = 0;i < N;i++) {
			p[i] = Integer.parseInt(spl[i]);
		}
		sc.close();
		int cnt = 0;
		for(int i = 0;i < N;i++) {
			if(p[i] != i + 1) {
				cnt++;
			}
		}
		System.out.println(cnt < 3 ? "YES" : "NO");
	}
}