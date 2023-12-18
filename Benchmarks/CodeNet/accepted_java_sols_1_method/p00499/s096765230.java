import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int k_cnt = 0, s_cnt = 0, answer;
		while(a > 0) {
			a = a - c;
			k_cnt = k_cnt + 1;
		}
		while(b > 0) {
			b = b - d;
			s_cnt = s_cnt + 1;
		}
		if(k_cnt > s_cnt) {
			answer = l - k_cnt;
		} else {
			answer = l - s_cnt;
		}
		System.out.println(answer);
	}

}