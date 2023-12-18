import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cnt = 0;
		int ans = 0;
		for(int i=1;i<=N;i++) {
			ans = String.valueOf(i).length();

			if(ans %2 != 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
