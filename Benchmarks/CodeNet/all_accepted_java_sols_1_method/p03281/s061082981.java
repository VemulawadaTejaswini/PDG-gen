import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		int cnt = 0;
		if(N < 104) {
			System.out.println(0);
		}else {
			for(int i = 105; i <= N; i+=2) {
				int cnt1 = 0;
				for(int j = 1; j <= i; j+=2) {
					if(i % j == 0) {
						cnt1 ++;
					}
				}
				//System.out.println(cnt1);
				if(cnt1 == 8) {
					cnt ++;
				}
			}
			System.out.println(cnt);
		}
	}
}