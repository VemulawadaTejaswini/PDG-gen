import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); int K = sc.nextInt();
		String S = sc.next();
		sc.close();
		char[] ch = S.toCharArray();
		int cnt = 0;
		for(int i = 1;i < N;i++) {
			if(ch[i]==ch[i-1]) {
				cnt++;
			}
		}
		System.out.println(Math.min(cnt + K * 2,N - 1));
	}
}