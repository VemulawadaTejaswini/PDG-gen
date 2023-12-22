import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 1;
		int ansCount = 0;
		for(int i = 1; i <= N; i++) {
			if(i%2 != 0) {
				continue;
			}
			int tmp = i;
			int count = 0;
			while(true) {
				if(tmp%2 == 0) {
					count++;
					tmp = tmp/2;
				} else {
					break;
				}
			}
			if(count > ansCount) {
				ans = i;
				ansCount = count;
			}
		}
		System.out.println(ans);
	}
}